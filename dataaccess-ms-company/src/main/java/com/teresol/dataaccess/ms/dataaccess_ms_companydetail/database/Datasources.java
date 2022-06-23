package com.teresol.dataaccess.ms.dataaccess_ms_companydetail.database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;

@ApplicationScoped
public class Datasources {

    @Inject
    @DataSource("cpu")
    AgroalDataSource cpuDataSource;

    @Inject
    @DataSource("karachi-main")
    AgroalDataSource karachiMainDataSource;

    @Inject
    @DataSource("conventional")
    AgroalDataSource conventionalDataSource;

    @Inject
    @DataSource("islamic")
    AgroalDataSource islamicDataSource;

    @Inject
    @DataSource("po")
    AgroalDataSource poDatasource;

    @Inject
    @DataSource("obs")
    AgroalDataSource obsDatasource;

    @Inject
    Logger log;

    public Connection getConnectionByBranch(String branchCode) {
        try {
            if (branchCode.equals("1001")) {
                return karachiMainDataSource.getConnection();
            } else if (branchCode.equals("1999")) {
                return cpuDataSource.getConnection();
            } else if (branchCode.length() == 4 && branchCode.charAt(0) == '5') {
                return islamicDataSource.getConnection();
            } else {
                return conventionalDataSource.getConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection getPoConnection() {
        try {
            return poDatasource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection getObsConnection() {
        try {
            return obsDatasource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
