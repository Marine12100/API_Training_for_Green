package api.training_for_green.services;

import api.training_for_green.enums.HttpStatus;
import api.training_for_green.exceptions.UserServiceException;
import dao.Training_for_Green.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UsersRepository dao;

    @Autowired
    public UserService(UsersRepository dao) {
        this.dao = dao;
    }

    public int verificationMotDePasseEtRecuperationIDGroupe(String mail, String motDePasse) {
        int idGroupeUtilisateur = 0;
        idGroupeUtilisateur = dao.checkPassword(mail, motDePasse);

        try {
            if (idGroupeUtilisateur == 0) {
                throw new UserServiceException(HttpStatus.SERVER_ERROR.getValue(), "id Groupe Utilisateur est vide");
            }
        } catch (NullPointerException e) {
            throw new UserServiceException(HttpStatus.SERVER_ERROR.getValue(), e.getMessage());
        }

        return idGroupeUtilisateur;
    }
}
