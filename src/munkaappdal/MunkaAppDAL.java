/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munkaappdal;

import com.munka.dao.*;
import com.munka.dashboards.DashboardUtil;
import com.munka.entities.Comentario;
import java.util.Date;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
public class MunkaAppDAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(new DashboardUtil().getGraficoStatus());
        System.out.println(new DashboardUtil().getGraficoZelador());

    }

}
