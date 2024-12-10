import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    public Form1() {
        // Configuración de la ventana principal (JFrame)
        setTitle("Formulario Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Uso de layout absoluto

        // Botones
        JButton btnDataStructure = new JButton("Data Structure");
        JButton btnDataStructureNotLineal = new JButton("Data Structure Not Lineal");
        JButton btnSearchAlgorithms = new JButton("Search Algorithms");

        // Posición de los botones
        btnDataStructure.setBounds(50, 50, 200, 30);
        btnDataStructureNotLineal.setBounds(50, 100, 200, 30);
        btnSearchAlgorithms.setBounds(50, 150, 200, 30);

        // Agregar los botones al JFrame
        add(btnDataStructure);
        add(btnDataStructureNotLineal);
        add(btnSearchAlgorithms);

        // Acción del botón "Data Structure"
        btnDataStructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Lineale lineale = new Lineale();
                lineale.setVisible(true);
            }
        });

        // Acción del botón "Data Structure Not Lineal"
        btnDataStructureNotLineal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NoLineal  noLineal = new NoLineal();
                noLineal.setVisible(true);
            }
        });

        // Acción del botón "Search Algorithms"
        btnSearchAlgorithms.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FromSeach fromSeach = new FromSeach();
                fromSeach.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
}
