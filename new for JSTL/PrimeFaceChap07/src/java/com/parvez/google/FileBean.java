package com.parvez.google;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/**
 * User: mertcaliskan
 * Date: 9/5/12
 */
@ManagedBean
public class FileBean implements Serializable {

    private UploadedFile file;

    private UploadedFile file1;
    private UploadedFile file2;

    private StreamedContent downloadFile;

    public FileBean() {
        InputStream stream = this.getClass().getResourceAsStream("/chapter7/PFSamplePDF.pdf");
        downloadFile = new DefaultStreamedContent(stream, "application/pdf", "PFSample.pdf");
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public UploadedFile getFile1() {
        return file1;
    }

    public void setFile1(UploadedFile file1) {
        this.file1 = file1;
    }

    public UploadedFile getFile2() {
        return file2;
    }

    public void setFile2(UploadedFile file2) {
        this.file2 = file2;
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        MessageUtil.addInfoMessage("upload.successful", file.getFileName() + " is uploaded.");
    }

    public StreamedContent getDownloadFile() {
        return downloadFile;
    }
    
    private UploadedFile uploadFile;
    public void save(FileUploadEvent event) throws IOException{
    
    uploadFile=event.getFile();
    String filename =FilenameUtils.getName(uploadFile.getFileName());
    InputStream input =uploadFile.getInputstream();
        OutputStream output = new FileOutputStream(new File("D:\\Users\\J2EE-33\\Documents\\upload"));
        try {
            IOUtils.copy(input,output);
            
        } finally { IOUtils.closeQuietly(input);
        IOUtils.closeQuietly(output);
        
        }
    
    }

    public UploadedFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(UploadedFile uploadFile) {
        this.uploadFile = uploadFile;
    }
}