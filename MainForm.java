import java.awt.*;
import javax.swing.*;

public class MainForm extends JFrame {
    private JList<String> lBoxOptions;

    public MainForm() {
        // Set up the main frame
        setTitle("Data Structures and Algorithms");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the list of options
        String[] options = {
                "Lists",
                "Stacks",
                "Queues",
                "Trees",
                "Graphs",
                "Algorithms"
        };

        lBoxOptions = new JList<>(options);
        lBoxOptions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add list selection listener
        lBoxOptions.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = lBoxOptions.getSelectedIndex();
                if (selectedIndex >= 0) {
                    openSelectedForm(selectedIndex);
                }
            }
        });

        // Add list to scrollpane
        JScrollPane scrollPane = new JScrollPane(lBoxOptions);

        // Set layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    private void openSelectedForm(int selectedIndex) {
        JFrame selectedForm = null;

        switch (selectedIndex) { 
            case 0 -> selectedForm = new ListsForm();
            case 1 -> selectedForm = new StacksForm();
            case 2 -> selectedForm = new QueuesForm();
            case 3 -> selectedForm = new TreesForm();
            case 4 -> selectedForm = new GraphsForm();
            case 5 -> selectedForm = new Algortihmos_In_Java();
            default -> JOptionPane.showMessageDialog(this, "Invalid selection");
        }

        if (selectedForm != null) {
            // Open the selected form
            selectedForm.setVisible(true);
        }
    }

    public static void main(String[] args) {
        // Ensure GUI is created on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }
}
