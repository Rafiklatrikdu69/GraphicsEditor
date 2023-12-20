/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.Controller_Add;
import Controller.Controller_Groupe;
import Controller.Controller_Supp;
import Controller.Controller_degrouper;
import Model.*;
import Model.Rectangle;
import Model.Shape;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * @author adrien.peytavie
 */
public class Window extends javax.swing.JFrame implements Observer {

    private final GraphicsPainter painter;
    private ShapeManager data;

    /**
     * Creates new form Window
     *
     * @param _data
     */
    public Window(ShapeManager _data) {
        initComponents();

        data = _data;
        data.addObserver(this);

        painter = new GraphicsPainter(data);

        jPanel1.setLayout(new java.awt.GridLayout(1, 1));
        jPanel1.add(painter);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Empty");
        jTree_Objects.setModel(new DefaultTreeModel(root));

        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Remove = new javax.swing.JButton();
        jButton_Group = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree_Objects = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jButton_UnGroup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerPositionX = new javax.swing.JSpinner();
        jSpinnerPositionY = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerRadius = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jButtonColor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneInformations = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jRadioCircle = new javax.swing.JRadioButton();
        jRadioSquare = new javax.swing.JRadioButton();
        jRadioRectangle = new javax.swing.JRadioButton();
        jButton_Add = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphics Editor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 461, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_Remove.setText("Remove");

        jButton_Group.setText("Group");

        jScrollPane1.setViewportView(jTree_Objects);

        jLabel1.setText("Properties");

        jButton_UnGroup.setText("UnGroup");

        jLabel2.setText("Center");

        jSpinnerPositionX.setEnabled(false);
        jSpinnerPositionX.setMinimumSize(new java.awt.Dimension(80, 22));

        jSpinnerPositionY.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("x");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("y");

        jLabel5.setText("Radius");

        jSpinnerRadius.setEnabled(false);

        jLabel6.setText("Color");

        jButtonColor.setBackground(new java.awt.Color(255, 0, 0));
        jButtonColor.setText("   ");
        jButtonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorActionPerformed(evt);
            }
        });

        jTextPaneInformations.setEnabled(false);
        jScrollPane2.setViewportView(jTextPaneInformations);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinnerPositionX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinnerRadius)
                                        .addComponent(jButtonColor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerPositionY, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton_Remove)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Group)
                                                .addGap(8, 8, 8)
                                                .addComponent(jButton_UnGroup))
                                        .addComponent(jScrollPane2))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jSpinnerPositionX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerPositionY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jSpinnerRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jButtonColor))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Group)
                                        .addComponent(jButton_Remove)
                                        .addComponent(jButton_UnGroup))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 100));

        buttonGroup1.add(jRadioCircle);
        jRadioCircle.setText("Circle");

        buttonGroup1.add(jRadioSquare);
        jRadioSquare.setText("Square");
        jRadioSquare.setToolTipText("");

        buttonGroup1.add(jRadioRectangle);
        jRadioRectangle.setText("Rectangle");

        jButton_Add.setText("Add");

        jButton_Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_RemoveActionPerformed(e);
            }
        });
        jButton_Group.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_GroupActionPerformed(e);
            }
        });
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (jButton_Add.getText().equals("Add")) {
                    // Code d'ajout ici
                    jButton_AddActionPerformed(evt);
                } else if (jButton_Add.getText().equals("Modifier")) {
                    // Code de modification ici
                    int selectedRow = jTree_Objects.getSelectionRows()[0];
                    ShapeManager.cpt = 0;

                    Shape shapes = data.recherche(selectedRow, data.getRoot());
                    if (shapes != null) {
                        int newCenterX = 0;
                        int newCenterY = 0;
                        Color newColor = null;
                        switch (shapes.getType()) {
                            case "Circle":
                                Circle circle = (Circle) shapes;
                                newCenterX = (int) jSpinnerPositionX.getValue();
                                newCenterY = (int) jSpinnerPositionY.getValue();
                                circle.setCenter(new Point(newCenterX, newCenterY));
                                circle.setRadius(((Number) jSpinnerRadius.getValue()).doubleValue());
                                newColor = jButtonColor.getBackground();
                                System.out.println("New Color: " + newColor);
                                circle.setColor(newColor);
                                System.out.println(circle.getType());
                                data.MajGroup();
                                break;
                            case "Square":
                                Square square = (Square) shapes;
                                newCenterX = (int) jSpinnerPositionX.getValue();
                                newCenterY = (int) jSpinnerPositionY.getValue();
                                square.setCenter(new Point(newCenterX, newCenterY));

                                newColor = jButtonColor.getBackground();
                                System.out.println("New Color: " + newColor);
                                square.setColor(newColor);
                                System.out.println(square.getType());
                                data.MajGroup();
                                break;
                            case "Rectangle":
                                Rectangle rectangle = (Rectangle) shapes;
                                newCenterX = (int) jSpinnerPositionX.getValue();
                                newCenterY = (int) jSpinnerPositionY.getValue();
                                rectangle.setHeight(newCenterY);
                                rectangle.setWidth(newCenterX);

                                newColor = jButtonColor.getBackground();
                                System.out.println("New Color: " + newColor);
                                rectangle.setColor(newColor);
                                System.out.println(rectangle.getType());
                                data.MajGroup();
                                break;

                            default:
                                System.out.println("Type de forme inconnu : " + shapes.getType());
                        }

                        // Mettez à jour votre modèle de données si nécessaire
                        data.MajGroup();

                        // Réinitialiser le bouton "Ajouter"
                        jButton_Add.setText("Add");
                    }
                }

            }
        });

        jTree_Objects.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    jSpinnerPositionX.setEnabled(true);
                    jSpinnerPositionY.setEnabled(true);
                    jSpinnerRadius.setEnabled(true);
                    System.out.println("double click !");
                    jButton_Add.setText("Modifier");

                    int selectedRow = jTree_Objects.getSelectionRows()[0];
                    ShapeManager.cpt = 0;
                    Shape shape = data.recherche(selectedRow, data.getRoot());

                    switch (shape.getType()) {
                        case "Circle":
                            Circle circle = (Circle) shape;
                            jSpinnerPositionX.setValue(circle.getCenter().x);
                            jSpinnerPositionY.setValue(circle.getCenter().y);
                            jSpinnerRadius.setValue(circle.getRadius());
                            jButtonColor.setBackground(circle.getColor());
                            System.out.println("Initial Color: " + circle.getColor());

                            break;
                        case "Square":
                            jSpinnerRadius.setEnabled(false);
                            Square square = (Square) shape;
                            jSpinnerPositionX.setValue(square.getCenter().x);
                            jSpinnerPositionY.setValue(square.getCenter().y);
                            jButtonColor.setBackground(square.getColor());
                            System.out.println("Initial Color: " + square.getColor());

                            break;
                        case "Rectangle":
                            jSpinnerRadius.setEnabled(false);
                            Rectangle rectangle = (Rectangle) shape;
                            jSpinnerPositionX.setValue(rectangle.getUpperLeft().x);
                            jSpinnerPositionY.setValue(rectangle.getUpperLeft().y);
                            jButtonColor.setBackground(rectangle.getColor());
                            System.out.println("Initial Color: " + rectangle.getColor());

                            break;

                        default:
                            // Cas par défaut
                            break;

                    }

                }
            }
        });


        jButton_UnGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_DeGroupActionPerformed(e);
            }
        });
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jRadioCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioRectangle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Add)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioCircle)
                                        .addComponent(jRadioSquare)
                                        .addComponent(jRadioRectangle)
                                        .addComponent(jButton_Add))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {
        Controller_Supp ca = new Controller_Supp(data);
        int[] selection = jTree_Objects.getSelectionRows();


        Arrays.sort(selection);

        ca.control(selection);


    }

    private void jButton_GroupActionPerformed(java.awt.event.ActionEvent evt) {

        int[] selection = jTree_Objects.getSelectionRows();
        Controller_Groupe cg = new Controller_Groupe(data);

        Arrays.sort(selection);
        cg.control(selection);


    }


    private void jButton_DeGroupActionPerformed(java.awt.event.ActionEvent evt) {

        int[] selection = jTree_Objects.getSelectionRows();
        Controller_degrouper cdeg = new Controller_degrouper(data);

        Arrays.sort(selection);
        cdeg.control(selection);


    }


    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed


        Controller_Add ca = new Controller_Add(data);

        if (jRadioCircle.isSelected()) {
            ca.control("Circle", Color.BLACK);

            jTextPaneInformations.setText("Circle ajouter");
            System.out.println("Le circle quoicoubeh");
        }
        if (jRadioSquare.isSelected()) {
            ca.control("Square", jButtonColor.getBackground());

            jTextPaneInformations.setText("Square ajouter");
            System.out.println("Square");
        }
        if (jRadioRectangle.isSelected()) {
            ca.control("Rectangle", jButtonColor.getBackground());
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButtonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);

        jButtonColor.setBackground(newColor);
        jTextPaneInformations.setText("Color Changed");

    }//GEN-LAST:event_jButtonColorActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        painter.revalidate();
        painter.repaint();

        // Reload JTree
        //TreePath[] selectionPaths = jTree_Objects.getSelectionPaths(); // need to reload and not to use setModel...
        jTree_Objects.setModel(data.getTreeModel());
        expandAllNodes(jTree_Objects);
        //jTree_Objects.setSelectionPaths(selectionPaths);

        // Properties
        jSpinnerPositionX.setEnabled(false);
        jSpinnerPositionY.setEnabled(false);
        jSpinnerRadius.setEnabled(false);

    }

    private void expandAllNodes(JTree tree) {
        int j = tree.getRowCount();
        int i = 0;
        while (i < j) {
            tree.expandRow(i);
            i += 1;
            j = tree.getRowCount();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonColor;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Group;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JButton jButton_UnGroup;
    private javax.swing.JButton ButtonModifier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioCircle;
    private javax.swing.JRadioButton jRadioRectangle;
    private javax.swing.JRadioButton jRadioSquare;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerPositionX;
    private javax.swing.JSpinner jSpinnerPositionY;
    private javax.swing.JSpinner jSpinnerRadius;
    private javax.swing.JTextPane jTextPaneInformations;
    private javax.swing.JTree jTree_Objects;
    // End of variables declaration//GEN-END:variables

}
