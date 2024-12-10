import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase Lineale (Ventana de Data Structure Lineale)
public class Lineale extends JFrame {

    public Lineale() {
        // Configuración de la ventana Lineale (JFrame)
        setTitle("Data Structure Lineale");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Botones
        JButton btnQueue = new JButton("Election Queue");
        JButton btnStack = new JButton("From Stack");
        JButton btnLists = new JButton("From List");

        // Posición de los botones
        btnQueue.setBounds(50, 50, 200, 30);
        btnStack.setBounds(50, 100, 200, 30);
        btnLists.setBounds(50, 150, 200, 30);

        // Agregar los botones al JFrame
        add(btnQueue);
        add(btnStack);
        add(btnLists);

        // Acción del botón "Election Queue"
        btnQueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ElectionQueue electionQueue = new ElectionQueue();
                electionQueue.setVisible(true);
            }
        });

        // Acción del botón "From Stack"
        btnStack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FromStack fromStack = new FromStack();
                fromStack.setVisible(true);
            }
        });

        // Acción del botón "From List"
        btnLists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FromList fromList = new FromList();
                fromList.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lineale().setVisible(true);
            }
        });
    }
}

// Clase ElectionQueue (Ventana de Election Queue)
class ElectionQueue extends JFrame {
    public ElectionQueue() {
        setTitle("Election Queue");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana Election Queue", SwingConstants.CENTER);
        add(label);
    }
}

// Clase FromStack (Ventana de From Stack)
class FromStack extends JFrame {
    public FromStack() {
        setTitle("From Stack");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana From Stack", SwingConstants.CENTER);
        add(label);
    }
}

// Clase FromList (Ventana de From List)
class FromList extends JFrame {
    public FromList() {
        setTitle("From List");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana From List", SwingConstants.CENTER);
        add(label);
    }
}
