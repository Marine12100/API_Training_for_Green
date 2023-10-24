/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.training_for_green;

import api.training_for_green.formater.Question;
import api.training_for_green.formater.Reponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThomasAndres
 */
public class MainManager {
    private Connection conn = connect();
    List<Question> getAllQuestion() {
        return null;
    }

    public MainManager() {
    }
    
    
    
    public Connection connect() {
        conn = null;
        ConnectionString cs = new ConnectionString();
        try {
            conn = DriverManager.getConnection(cs.getStringConnection(), "postgres", "xxxxx");
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public List<Question> test() throws SQLException{
        connect();
        Statement st = conn.createStatement();
        List<Question> toReturn = new ArrayList<>();
        ResultSet rs = st.executeQuery("SELECT question, reponsea, reponseb, reponsec, reponsed, reponsevraie FROM questions WHERE id_3 = 1");
        while (rs.next()) {
            Reponse a = new Reponse(1,rs.getString(2), ("a".equals(rs.getString(6))));
            Reponse b = new Reponse(2,rs.getString(3), ("b".equals(rs.getString(6))));
            Reponse c = new Reponse(3,rs.getString(4), ("c".equals(rs.getString(6))));
            Reponse d = new Reponse(4,rs.getString(5), ("d".equals(rs.getString(6))));
            List<Reponse> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            Question q = new Question(1, rs.getString(1));
            q.setReponses(list);
            toReturn.add(q);
            //System.out.println(rs.getString(1));
            
        }
        rs.close();
        st.close();
        return toReturn;
    }
            

    List<Question> getOneQuestion() {
        List<Question> questionList = new ArrayList<>();
        Reponse a = new Reponse(1,"Reponse A", false);
        Reponse b = new Reponse(2,"Reponse B", false);
        Reponse c = new Reponse(3,"Reponse C", true);
        Reponse d = new Reponse(4,"Reponse D", false);
        List<Reponse> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Question q = new Question(1, "Quel est la bonne réponse ?");
        q.setReponses(list);
        questionList.add(q);
        return questionList;
    }
    
}
