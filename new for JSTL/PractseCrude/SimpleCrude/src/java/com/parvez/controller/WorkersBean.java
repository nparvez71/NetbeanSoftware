/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.controller;

import com.parvez.dao.WorkersDao;
import com.parvez.entity.Workers;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author J2EE-33
 */
@ManagedBean
@SessionScoped
public class WorkersBean {

    Workers workers = new Workers();
    WorkersDao workersdao = new WorkersDao();

    public Workers getWorkers() {
        return workers;
    }

    public void setWorkers(Workers workers) {
        this.workers = workers;
    }

    public WorkersDao getWorkersdao() {
        return workersdao;
    }

    public void setWorkersdao(WorkersDao workersdao) {
        this.workersdao = workersdao;
    }

    public List<Workers> getAllWorkers() {

        return workersdao.allWorkers();
    }

    public String addWorkers() {
        workersdao.add(workers);
        return "welcomePrimefaces.xhtml?faces-redirect=true";
    }

    public String updatWorkers(Workers workers) {
        workersdao.update(workers);
        return "welcomePrimefaces.xhtml?faces-redirect=true";
    }

    public String deleteWorkers(Workers workers) {
        workersdao.delete(workers);
        return "welcomePrimefaces.xhtml?faces-redirect=true";
    }

    public void changeWorkers(Workers workers) {
        this.workers = workers;
    }
}
