package repository.impl;

import eneity.Persion;
import eneity.PersionIm;
import repository.PersionRepository;
import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersionRepostioryImpl implements PersionRepository {

    @Override
    public List<PersionIm> showall(String username) {
        List<PersionIm> list = new ArrayList<>();
        String sql = "select * from PersionIm where username = ?";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new PersionIm(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void add(PersionIm persionIm) {
        String sql = "insert into PersionIm (name,tel,addres,username) values (?,?,?,?)";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,persionIm.getName());
            preparedStatement.setString(2,persionIm.getTel());
            preparedStatement.setString(3,persionIm.getAdd());
            preparedStatement.setString(4,persionIm.getUsername());
            int i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
