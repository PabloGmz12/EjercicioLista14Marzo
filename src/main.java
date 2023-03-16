
import pckControladores.ListaController;
import pckModelos.ListaModel;
import pckVistas.frmListas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author huawei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmListas VistaListas = new frmListas(null,true);
        ListaModel ModeloLista = new ListaModel();
        ListaController ControladorLista = new ListaController(VistaListas, ModeloLista);
    }
}
