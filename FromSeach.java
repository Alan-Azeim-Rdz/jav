import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase FromSeach (Ventana para Algoritmos de Búsqueda)
public class FromSeach extends JFrame {

    public FromSeach() {
        // Configuración de la ventana FromSeach (JFrame)
        setTitle("Search Algorithms");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Botones
        JButton btnSecuentialAndBinary = new JButton("Secuential and Binary");
        JButton btnAnotherOption = new JButton("Another Option");

        // Posición de los botones
        btnSecuentialAndBinary.setBounds(50, 50, 200, 30);
        btnAnotherOption.setBounds(50, 100, 200, 30);

        // Agregar los botones al JFrame
        add(btnSecuentialAndBinary);
        add(btnAnotherOption);

        // Acción del botón "Secuential and Binary"
        btnSecuentialAndBinary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecuentialAndBinary secuentialAndBinary = new SecuentialAndBinary();
                secuentialAndBinary.setVisible(true);
            }
        });

        // Acción del segundo botón (no implementada, puedes agregarla según sea necesario)
        btnAnotherOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se puede agregar más funcionalidad si es necesario
                JOptionPane.showMessageDialog(null, "Another option selected");
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FromSeach().setVisible(true);
            }
        });
    }
}

// Clase SecuentialAndBinary (Ventana de Búsqueda Secuencial y Binaria)
class SecuentialAndBinary extends JFrame {
    public SecuentialAndBinary() {
        setTitle("Secuential and Binary Search");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana Secuential and Binary Search", SwingConstants.CENTER);
        add(label);
    }
}
