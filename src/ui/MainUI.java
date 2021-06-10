package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable table1;
    private JComboBox genreCombo;
    private JComboBox typeCombo;
    private JTextField minVotesFIEL;
    private JButton episodeButton;
    private JButton imdbButton;




    public MainUI() {
        creatTable();
        createGenreCombo();
        createTypeComboreCombo();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
    private void creatTable() {
        Object[][] data ={
                {"The Dark Khight", 2008, 9.0, 1886938},
                {"Star Wars: Episode v - The Empire Strikes Back", 1980, 8.8, 962165},
                {"Inception", 2010, 8.8, 1675116}
        };
        table1.setModel(new DefaultTableModel(
                data,
                new String[]{"Title", "year", "Rating", "Num Votes"}
        ));
        TableColumnModel columns = table1.getColumnModel();
        columns.getColumn( 0) .setMinWidth(250);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn( 1).setCellRenderer(centerRenderer);
        columns.getColumn( 2).setCellRenderer(centerRenderer);
        columns.getColumn( 3).setCellRenderer(centerRenderer);
    }

    private void createGenreCombo() {
        genreCombo.setModel(new DefaultComboBoxModel(new String[]{"Action", "Fantasy", "Drama", "Romance", "Sci-Fi"}));
    }

    private void createTypeComboreCombo() {
        typeCombo.setModel(new DefaultComboBoxModel(new String[]{"movie", "tvSeries", "tvEpisode", "shprt"}));
    }
}
