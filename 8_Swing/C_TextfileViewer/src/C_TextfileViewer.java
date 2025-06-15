import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class C_TextfileViewer {
    private static final int MAX_LINES = 10;

    public C_TextfileViewer(File file) {
        JFrame frame = new JFrame(file.getName());
        String[] content = C_TextfileViewer.readTextfile(file);
        final int displayLines = Math.min(content.length, C_TextfileViewer.MAX_LINES);
        frame.setLayout(new GridLayout(displayLines, 1));
        for (int i = 0; i < displayLines; i++) {
            frame.add(new JLabel(content[i]));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }

    public static String[] readTextfile(File f) {
        int lines = 0;
        String[] result = null;

        // Count lines
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while (br.ready()) {
                br.readLine();
                lines++;
            }
        } catch (IOException e) {
            e.printStackTrace(); // TODO: nice error handling
        }

        // Create array with count of lines as length
        result = new String[lines];
        lines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while (br.ready()) {
                result[lines++] = br.readLine();
            }
        } catch (IOException ex) { // Renamed variable to avoid conflict
            ex.printStackTrace(); // TODO: nice error handling
        }

        return result;
    }

    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".txt") || f.getName().toLowerCase().endsWith(".md");
            }

            @Override
            public String getDescription() {
                return "Text files (*.txt)";
            }
        });

        int state = fc.showOpenDialog(null);
        if (state == JFileChooser.APPROVE_OPTION) {
            new C_TextfileViewer(fc.getSelectedFile());
        } else {
            JOptionPane.showMessageDialog(null, "Choice cancelled");
        }
    }
}