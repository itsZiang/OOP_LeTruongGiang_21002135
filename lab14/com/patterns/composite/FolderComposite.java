package com.patterns.composite;

import java.util.List;

public class FolderComposite implements FileComponent {
    private List<FileComponent> files;

    public FolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (FileComponent file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent file : files) {
            total += file.totalSize();
        }
        return total;
    }
}
