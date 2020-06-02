package repository.impl;

import eneity.Persion;
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
    public List<Persion> showall() {
        List<Persion> list = new ArrayList<>();
        String sql = "select * from Persion";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new Persion(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
