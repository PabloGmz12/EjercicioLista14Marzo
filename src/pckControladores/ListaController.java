/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import pckModelos.Clientes;
import pckModelos.ListaModel;
import pckVistas.frmListas;

/**
 *
 * @author huawei
 */
public class ListaController implements ActionListener{
    frmListas VistaLista;
    ListaModel ModeloListas;

    public ListaController(frmListas VistaLista, ListaModel ModeloListas) {
        this.VistaLista = VistaLista;
        this.ModeloListas = ModeloListas;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        //LEVANTAR LA VISTA LISTA
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnIngresarCliente){
            this.ModeloListas.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombre.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue <Clientes> ListaLocal = this.ModeloListas.ListarClientes();
            
            //RECORRE LA LISTA Y LA ASIGNA EN EL TEXT AREA
            String cadena = "";
            for(Clientes MiListaClientes: ListaLocal){
                cadena = cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
                this.VistaLista.txtListaClientes.setText(cadena);
            }
        }
        
    }
    
}
