package com.nc.autumn2020.lessons.lesson25;

import com.nc.autumn2020.LessonApi;
import org.springframework.boot.autoconfigure.web.servlet.JspTemplateAvailabilityProvider;
import org.springframework.context.ApplicationEventPublisher;

import java.sql.*;
import java.util.Scanner;
//import org.h2.Driver;


public class Solution25 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        /*try {
            DriverManager.registerDriver(Driver.load());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try ( Connection connection = DriverManager
                .getConnection("jdbc:h2:F:\\1", "User1", "User1");
        )
        {
            //System.out.println(connection.createStatement());

           /* try (PreparedStatement preparedStatement = connection.prepareStatement("")) {
                ResultSet resultSet = preparedStatement.executeQuery()

            }*/



            this.createTable(connection,
                    "Shop",
                    "id INT PRIMARY KEY AUTO_INCREMENT",
                    "name VARCHAR(200)",
                    "amount INT");

            Scanner scanner = new Scanner(System.in);
            int i = 0;
            while (i != 3) {
                System.out.println("Введите пункт:\n1.\tДобавить значения.\n2.\tПоказать все строки.\n3.\tВыход.\n");
                i = scanner.nextInt();

                if (i == 1) {
                    this.addValues(connection);
                } else
                    if (i == 2) {
                        this.showAll(connection);
                    } else
                        if (i == 3) {
                            break;
                        }
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        System.out.println("Done!");

    }

    public void createTable(Connection connection, String tableName, String... params) {
        StringBuilder query = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        query.append(tableName);
        query.append("(");
        for (int i = 0; i < params.length; i++) {
            query.append(params[i]);
            if (i+1 < params.length)
                query.append(", ");
        }
        query.append(");");

        try (Statement statement = connection.createStatement();)
        {
            int resultSet = statement.executeUpdate(query.toString());


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addValues(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение name:");
        String name;
        name = scanner.next();
        System.out.println("Введите значение amount:");
        Integer amount;
        amount = scanner.nextInt();

        StringBuilder query = new StringBuilder("INSERT INTO SHOP(NAME, AMOUNT) VALUES ");
        query.append("(");
        query.append("'");
        query.append(name);
        query.append("', ");
        query.append("'");
        query.append(amount);
        query.append("'");
        query.append(");");

        try (Statement statement = connection.createStatement();)
        {
            statement.executeUpdate(query.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void showAll(Connection connection) {
        try (Statement statement = connection.createStatement();)
        {
            try(ResultSet resultSet = connection
                    .prepareStatement("SELECT * FROM SHOP;", Statement.NO_GENERATED_KEYS)
                    .executeQuery()) {

                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    System.out.print(resultSet.getMetaData().getColumnLabel(i) + "\t");
                }

                System.out.println("\n");

                while (resultSet.next()) {
                    System.out.print(resultSet.getInt(1) + "\t");
                    System.out.print(resultSet.getString(2) + "\t");
                    System.out.println(resultSet.getString(3) + "\t");
                }

                System.out.println("\n");
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
