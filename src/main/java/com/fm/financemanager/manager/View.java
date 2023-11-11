package com.fm.financemanager.manager;

public enum View {
    MAIN("/com/fm/financemanager/main.fxml");

    private final String filepath;

    View(String filepath) {
        this.filepath = filepath;
    }
    public String getFilepath() {
        return filepath;
    }
}
