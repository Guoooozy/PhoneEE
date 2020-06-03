package repository.impl;

import eneity.Persion;
import repository.LoginRepository;
import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepositoryImpl implements LoginRepository {

    @Override
    public Persion Login(String username, String password) {
        String sql = "select * from Persion where username = ? and password = ?";
        Connection connection = new JDBC().getConn();
        Persion persion = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                persion = new Persion(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persion;
    }

    @Override
    public void Register(Persion persion) {
        String sql = "insert into Persion (username,tel,add,password) values (?,?,?,?)";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,persion.getUsername());
            preparedStatement.setString(2,persion.getTel());
            preparedStatement.setString(3,persion.getAdd());
            preparedStatement.setString(4,persion.getPassword());
            int i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
