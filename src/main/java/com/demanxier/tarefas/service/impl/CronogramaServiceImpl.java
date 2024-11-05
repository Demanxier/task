package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Cronograma;
import com.demanxier.tarefas.model.form.CronogramaForm;
import com.demanxier.tarefas.repository.CronogramaRepository;
import com.demanxier.tarefas.service.ICronogramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CronogramaServiceImpl implements ICronogramaService {

    @Autowired
    private CronogramaRepository cronogramaRepository;

    @Override
    public Cronograma create(CronogramaForm cronogramaForm) {
        Cronograma cronograma = new Cronograma();
        cronograma.setTitulo(cronogramaForm.getTitulo());
        cronograma.setDescricao(cronogramaForm.getDescricao());
        cronograma.setDataAcao(cronogramaForm.getDataAcao());
        cronograma.setHorIni(cronogramaForm.getHorIni());
        cronograma.setHorFim(cronogramaForm.getHorFim());
        cronograma.setCategoria(cronogramaForm.getCategoria());
        cronograma.setTarefa(cronogramaForm.getTarefa());
        return cronogramaRepository.save(cronograma);
    }

    @Override
    public Cronograma get(Long id) {
        return cronogramaRepository.findById(id).get();
    }

    @Override
    public List<Cronograma> getAll() {
        return cronogramaRepository.findAll();
    }

    @Override
    public Cronograma update(Long id, CronogramaForm cronogramaForm) {
        Cronograma cronograma = cronogramaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cronograma não encontrado."));

        cronograma.setTitulo(cronogramaForm.getTitulo());
        cronograma.setDescricao(cronogramaForm.getDescricao());
        cronograma.setDataAcao(cronogramaForm.getDataAcao());
        cronograma.setHorIni(cronogramaForm.getHorIni());
        cronograma.setHorFim(cronogramaForm.getHorFim());
        cronograma.setCategoria(cronogramaForm.getCategoria());
        cronograma.setTarefa(cronogramaForm.getTarefa());

        return cronogramaRepository.save(cronograma);
    }

    @Override
    public void delete(Long id) {
        Cronograma cronograma = cronogramaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cronograma não encontrado."));

        cronogramaRepository.delete(cronograma);
    }
}
