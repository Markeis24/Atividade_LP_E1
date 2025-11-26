package E2.Controller;

import E2.DAO.CervejaDAO;
import E2.DAO.ConfusaoDAO;
import E2.DAO.VagaDAO;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Meio_PsicopataController {

    // --- Cerveja ---
    @FXML private TextField txtQtdCerveja;
    @FXML private TextField txtTempCerveja;
    @FXML private TextField txtMarcaCerveja;
    @FXML private TableView<ObservableList<Object>> tableCerveja;
    @FXML private TableColumn<ObservableList<Object>, Integer> colIdCerveja;
    @FXML private TableColumn<ObservableList<Object>, Integer> colQtdCerveja;
    @FXML private TableColumn<ObservableList<Object>, Double> colTempCerveja;
    @FXML private TableColumn<ObservableList<Object>, String> colMarcaCerveja;

    private CervejaDAO cervejaDAO = new CervejaDAO();
    private int selectedCervejaId = -1;

    // --- Confusao ---
    @FXML private TextField txtBriga;
    @FXML private TextField txtMotivo;
    @FXML private TextField txtLugar;
    @FXML private TableView<ObservableList<Object>> tableConfusao;
    @FXML private TableColumn<ObservableList<Object>, Integer> colIdConfusao;
    @FXML private TableColumn<ObservableList<Object>, String> colBriga;
    @FXML private TableColumn<ObservableList<Object>, String> colMotivo;
    @FXML private TableColumn<ObservableList<Object>, String> colLugar;

    private ConfusaoDAO confusaoDAO = new ConfusaoDAO();
    private int selectedConfusaoId = -1;

    // --- Vaga ---
    @FXML private TextField txtAmeaca;
    @FXML private TextField txtCarro;
    @FXML private TextField txtDono;
    @FXML private TableView<ObservableList<Object>> tableVaga;
    @FXML private TableColumn<ObservableList<Object>, Integer> colIdVaga;
    @FXML private TableColumn<ObservableList<Object>, String> colAmeaca;
    @FXML private TableColumn<ObservableList<Object>, String> colCarro;
    @FXML private TableColumn<ObservableList<Object>, String> colDono;

    private VagaDAO vagaDAO = new VagaDAO();
    private int selectedVagaId = -1;

    @FXML
    public void initialize() {
        // --- Cerveja Tabela ---
        colIdCerveja.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((Integer) data.getValue().get(0)));
        colQtdCerveja.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((Integer) data.getValue().get(1)));
        colTempCerveja.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((Double) data.getValue().get(2)));
        colMarcaCerveja.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(3)));
        colIdCerveja.setVisible(false);
        tableCerveja.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        atualizarTabelaCerveja();

        tableCerveja.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                selectedCervejaId = (int) newSel.get(0);
                txtQtdCerveja.setText(newSel.get(1).toString());
                txtTempCerveja.setText(newSel.get(2).toString());
                txtMarcaCerveja.setText(newSel.get(3).toString());
            }
        });

        // --- Confusao Tabela ---
        colIdConfusao.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((Integer) data.getValue().get(0)));
        colBriga.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(1)));
        colMotivo.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(2)));
        colLugar.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(3)));
        colIdConfusao.setVisible(false);
        tableConfusao.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        atualizarTabelaConfusao();

        tableConfusao.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                selectedConfusaoId = (int) newSel.get(0);
                txtBriga.setText(newSel.get(1).toString());
                txtMotivo.setText(newSel.get(2).toString());
                txtLugar.setText(newSel.get(3).toString());
            }
        });

        // --- Vaga Tabela ---
        colIdVaga.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((Integer) data.getValue().get(0)));
        colAmeaca.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(1)));
        colCarro.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(2)));
        colDono.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>((String) data.getValue().get(3)));
        colIdVaga.setVisible(false);
        tableVaga.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        atualizarTabelaVaga();

        tableVaga.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                selectedVagaId = (int) newSel.get(0);
                txtAmeaca.setText(newSel.get(1).toString());
                txtCarro.setText(newSel.get(2).toString());
                txtDono.setText(newSel.get(3).toString());
            }
        });
    }

    // --------------------- CERVEJA ---------------------
    @FXML private void inserirCerveja() {
        cervejaDAO.inserir(Integer.parseInt(txtQtdCerveja.getText()), Double.parseDouble(txtTempCerveja.getText()), txtMarcaCerveja.getText());
        atualizarTabelaCerveja();
    }

    @FXML private void atualizarCerveja() {
        if (selectedCervejaId != -1) {
            cervejaDAO.atualizar(selectedCervejaId, Integer.parseInt(txtQtdCerveja.getText()), Double.parseDouble(txtTempCerveja.getText()), txtMarcaCerveja.getText());
            atualizarTabelaCerveja();
        }
    }

    @FXML private void excluirCerveja() {
        if (selectedCervejaId != -1) {
            cervejaDAO.excluir(selectedCervejaId);
            atualizarTabelaCerveja();
        }
    }

    @FXML private void buscarCerveja() {
        try {
            preencherTabela(tableCerveja, cervejaDAO.buscarPorMarca(txtMarcaCerveja.getText()));
        } catch (SQLException e) { e.printStackTrace(); }
    }

    private void atualizarTabelaCerveja() {
        try { preencherTabela(tableCerveja, cervejaDAO.listar()); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    // --------------------- CONFUSAO ---------------------
    @FXML private void inserirConfusao() {
        confusaoDAO.inserir(txtBriga.getText(), txtMotivo.getText(), txtLugar.getText());
        atualizarTabelaConfusao();
    }

    @FXML private void atualizarConfusao() {
        if (selectedConfusaoId != -1) {
            confusaoDAO.atualizar(selectedConfusaoId, txtBriga.getText(), txtMotivo.getText(), txtLugar.getText());
            atualizarTabelaConfusao();
        }
    }

    @FXML private void excluirConfusao() {
        if (selectedConfusaoId != -1) {
            confusaoDAO.excluir(selectedConfusaoId);
            atualizarTabelaConfusao();
        }
    }

    @FXML private void buscarConfusao() {
        try { preencherTabela(tableConfusao, confusaoDAO.buscarPorBriga(txtBriga.getText())); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    private void atualizarTabelaConfusao() {
        try { preencherTabela(tableConfusao, confusaoDAO.listar()); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    // --------------------- VAGA ---------------------
    @FXML private void inserirVaga() {
        vagaDAO.inserir(txtAmeaca.getText(), txtCarro.getText(), txtDono.getText());
        atualizarTabelaVaga();
    }

    @FXML private void atualizarVaga() {
        if (selectedVagaId != -1) {
            vagaDAO.atualizar(selectedVagaId, txtAmeaca.getText(), txtCarro.getText(), txtDono.getText());
            atualizarTabelaVaga();
        }
    }

    @FXML private void excluirVaga() {
        if (selectedVagaId != -1) {
            vagaDAO.excluir(selectedVagaId);
            atualizarTabelaVaga();
        }
    }

    @FXML private void buscarVaga() {
        try { preencherTabela(tableVaga, vagaDAO.buscarPorAmeaca(txtAmeaca.getText())); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    private void atualizarTabelaVaga() {
        try { preencherTabela(tableVaga, vagaDAO.listar()); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    // --------------------- AUXILIAR ---------------------
    private void preencherTabela(TableView<ObservableList<Object>> table, ResultSet rs) throws SQLException {
        ObservableList<ObservableList<Object>> data = FXCollections.observableArrayList();
        while (rs.next()) {
            ObservableList<Object> row = FXCollections.observableArrayList();
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                row.add(rs.getObject(i));
            }
            data.add(row);
        }
        table.setItems(data);
    }
}
