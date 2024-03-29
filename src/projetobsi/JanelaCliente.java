/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobsi;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.JTableBinding.ColumnBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Laboratorio
 */
public class JanelaCliente extends javax.swing.JInternalFrame {

    private List<Cliente> lstClientes;
    
    /**
     * Creates new form JanelaCliente
     */
    public JanelaCliente() {
        ClienteDAO cd = new ClienteDAO();
        lstClientes = cd.listar();
        
        initComponents();
        
        BindingGroup bg = new BindingGroup();
        JTableBinding tb = SwingBindings.createJTableBinding(
                    AutoBinding.UpdateStrategy.READ_WRITE,
                    lstClientes, tbCliente);
        ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("nome"));
        cb.setColumnName("Nome do Cliente");
        cb.setColumnClass(String.class);
        
        cb = tb.addColumnBinding(BeanProperty.create("endereco"));
        cb.setColumnName("Endereço");
        cb.setColumnClass(String.class);
        
        cb = tb.addColumnBinding(BeanProperty.create("dataNasc"));
        cb.setColumnName("Data Nasc.");
        cb.setColumnClass(Date.class);
        
        bg.addBinding(tb);
        
        Binding b;
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbCliente, BeanProperty.create("selectedElement.nome"),
                txtNome, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbCliente, BeanProperty.create("selectedElement.endereco"),
                txtEndereco, BeanProperty.create("text"));
        bg.addBinding(b);

        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbCliente, BeanProperty.create("selectedElement.dataNasc"),
                txtDataNasc, BeanProperty.create("text")
            );
        ConversorDateString sd = new ConversorDateString();
        b.setConverter(sd);
        bg.addBinding(b);
        
        bg.bind();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        srcTbCliente = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btAdicionar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblNome.setText("Nome:");

        lblEndereco.setText("Endereço:");

        lblDataNasc.setText("Data Nasc:");

        tbCliente.setAutoCreateRowSorter(true);
        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        srcTbCliente.setViewportView(tbCliente);

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srcTbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btAdicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNasc)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(srcTbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btExcluir)
                    .addComponent(btGravar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        
        if(getDesktopPane() instanceof AreaDeTrabalho){
            ((AreaDeTrabalho)getDesktopPane()).fecharCadCliente();
        }
        
    }//GEN-LAST:event_formInternalFrameClosing

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        
        Cliente c = new Cliente();
        if(tbCliente.getSelectedRows().length==0)
        {
            c.setNome(txtNome.getText());
            c.setEndereco(txtEndereco.getText());
        }
        lstClientes.add(c);
        
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        int idx[] = tbCliente.getSelectedRows();
        List<Cliente> apagar = new LinkedList<>();
        tbCliente.getSelectionModel().setSelectionInterval(0,0);
        for(int i=0;i<idx.length;i++){
            int idxTab = idx[i];
            int idxLista = tbCliente.convertRowIndexToModel(idxTab);
            apagar.add(lstClientes.get(idxLista));
        }
        
        lstClientes.removeAll(apagar);
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        ClienteDAO cd = new ClienteDAO();
        
        for(Cliente c:lstClientes){
            if(c.getId()==null)
                cd.inserir(c);
//            else
//                cd.alterar(c);
        }
        
    }//GEN-LAST:event_btGravarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JScrollPane srcTbCliente;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
