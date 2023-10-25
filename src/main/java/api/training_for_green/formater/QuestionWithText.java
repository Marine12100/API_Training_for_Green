/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.training_for_green.formater;

import java.util.List;

/**
 *
 * @author ThomasAndres
 */
public class QuestionWithText extends Question{
    public String titreCours;
    public String coursDesc;

    public QuestionWithText(int id, String question) {
        super(id, question);
        this.titreCours = titreCours;
        this.coursDesc = coursDesc;
    }

    public String getTitreCours() {
        return titreCours;
    }

    public void setTitreCours(String titreCours) {
        this.titreCours = titreCours;
    }

    public String getCoursDesc() {
        return coursDesc;
    }

    public void setCoursDesc(String coursDesc) {
        this.coursDesc = coursDesc;
    }
    
    
    
}
