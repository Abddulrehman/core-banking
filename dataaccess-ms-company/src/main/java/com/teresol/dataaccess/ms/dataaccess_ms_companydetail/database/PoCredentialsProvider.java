package com.teresol.dataaccess.ms.dataaccess_ms_companydetail.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.util.PasswordDecrypter;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;
import io.quarkus.arc.Unremovable;
import io.quarkus.credentials.CredentialsProvider;

@ApplicationScoped
@Unremovable
@Named("po-credential-provider")
public class PoCredentialsProvider implements CredentialsProvider {

    @Inject
    @DataSource("po-app")
    AgroalDataSource poDataSource;

    @Override
    public Map<String, String> getCredentials(String credentialsProviderName) {
        String username = "";
        String password = "";
        try (Connection connection = poDataSource.getConnection();
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT * FROM APPUSER.CONNECTION_TL ct2 ");
                ResultSet resultSet = preparedStatement.executeQuery();) {

            if (resultSet.next()) {
                username = resultSet.getString("USER_ID");
                password = resultSet.getString("PASSWORD");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        Map<String, String> properties = new HashMap<>();
        properties.put(USER_PROPERTY_NAME, username);
        properties.put(PASSWORD_PROPERTY_NAME, PasswordDecrypter.getDecryptPsw(username,
                password).toLowerCase());
        return properties;
    }

}
