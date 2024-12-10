import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase NoLineal (Ventana de Data Structure No Lineal)
public class NoLineal extends JFrame {

    public NoLineal() {
        // Configuración de la ventana NoLineal (JFrame)
        setTitle("Data Structure No Lineal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Botones
        JButton btnTree = new JButton("Tree");
        JButton btnGraph = new JButton("Graph");
        JButton btnHeap = new JButton("Heap");

        // Posición de los botones
        btnTree.setBounds(50, 50, 200, 30);
        btnGraph.setBounds(50, 100, 200, 30);
        btnHeap.setBounds(50, 150, 200, 30);

        // Agregar los botones al JFrame
        add(btnTree);
        add(btnGraph);
        add(btnHeap);

        // Acción del botón "Tree"
        btnTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TreeWindow treeWindow = new TreeWindow();
                treeWindow.setVisible(true);
            }
        });

        // Acción del botón "Graph"
        btnGraph.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GraphWindow graphWindow = new GraphWindow();
                graphWindow.setVisible(true);
            }
        });

        // Acción del botón "Heap"
        btnHeap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeapWindow heapWindow = new HeapWindow();
                heapWindow.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NoLineal().setVisible(true);
            }
        });
    }
}

// Clase TreeWindow (Ventana de Tree)
class TreeWindow extends JFrame {
    public TreeWindow() {
        setTitle("Tree");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana Tree", SwingConstants.CENTER);
        add(label);
    }
}

// Clase GraphWindow (Ventana de Graph)
class GraphWindow extends JFrame {
    public GraphWindow() {
        setTitle("Graph");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana Graph", SwingConstants.CENTER);
        add(label);
    }
}

// Clase HeapWindow (Ventana de Heap)
class HeapWindow extends JFrame {
    public HeapWindow() {
        setTitle("Heap");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Ventana Heap", SwingConstants.CENTER);
        add(label);
    }
}
