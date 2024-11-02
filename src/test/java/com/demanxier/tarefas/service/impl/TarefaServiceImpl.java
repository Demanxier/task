package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.AreaAtuacao;
import com.demanxier.tarefas.model.Tarefa;
import com.demanxier.tarefas.model.Usuario;
import com.demanxier.tarefas.model.enuns.Prioridade;
import com.demanxier.tarefas.model.enuns.Status;
import com.demanxier.tarefas.model.form.TarefaForm;
import com.demanxier.tarefas.model.form.TarefaUpdateForm;
import com.demanxier.tarefas.repository.AreaAtuacaoRepository;
import com.demanxier.tarefas.repository.TarefaRepository;
import com.demanxier.tarefas.repository.UsuarioRepository;
import com.demanxier.tarefas.service.ITarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TarefaServiceImpl implements ITarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    @Autowired
    private AreaAtuacaoRepository areaAtuacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Tarefa create(TarefaForm tarefaForm) {
        AreaAtuacao areaAtuacao = areaAtuacaoRepository.findById(tarefaForm.getId_AreaAtuacao())
                .orElseThrow(()-> new RuntimeException("Area não encontrada."));

        Usuario usuario = usuarioRepository.findById(tarefaForm.getId_usuario())
                .orElseThrow(()-> new RuntimeException("Usuario não encontrado."));

        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(tarefaForm.getTitulo());
        tarefa.setDescricao(tarefaForm.getDescricao());
        tarefa.setDataCriacao(LocalDate.now());
        tarefa.setDataVencimento(tarefaForm.getDataVencimento());
        tarefa.setAgendamento(tarefaForm.getAgendamento());
        tarefa.setStatus(Status.NOVO);
        tarefa.setPrioridade(Prioridade.BAIXA);

        tarefa.setAreaAtuacao(areaAtuacao);
        tarefa.setUsuario(usuario);

        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa get(Long id) {
        return tarefaRepository.findById(id).get();
    }

    @Override
    public List<Tarefa> getAll() {
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa update(Long id, TarefaForm tarefaForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));

        AreaAtuacao areaAtuacao = areaAtuacaoRepository.findById(tarefaForm.getId_AreaAtuacao())
                .orElseThrow(()-> new RuntimeException("Area não encontrada."));

        tarefa.setTitulo(tarefaForm.getTitulo());
        tarefa.setDescricao(tarefaForm.getDescricao());
        tarefa.setDataVencimento(tarefaForm.getDataVencimento());
        tarefa.setAgendamento(tarefaForm.getAgendamento());
        tarefa.setStatus(tarefaForm.getStatus());
        tarefa.setPrioridade(tarefaForm.getPrioridade());

        tarefa.setAreaAtuacao(areaAtuacao);

        return tarefaRepository.save(tarefa);
    }

    @Override
    public void delete(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));

        tarefaRepository.delete(tarefa);
    }

    @Override
    public Tarefa statusAgendado(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));

        tarefa.setStatus(Status.AGENDADO);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa statusAFazer(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setStatus(Status.A_FAZER);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa statusFazendo(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setStatus(Status.FAZENDO);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa statusPausado(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setStatus(Status.PAUSADO);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa statusPendente(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setStatus(Status.PENDENTE);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa statusConcluido(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setStatus(Status.CONCLUIDO);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa prioridadeUrgente(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setPrioridade(Prioridade.URGENTE);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa prioridadeAlta(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setPrioridade(Prioridade.ALTA);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa prioridadeBaixa(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setPrioridade(Prioridade.BAIXA);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa prioridadeSemPrioridade(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setPrioridade(Prioridade.SEM_PRIORIDADE);
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa updateDescricao(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setDescricao(tarefaUpdateForm.getDescricao());
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa updateDatas(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setDataVencimento(tarefaUpdateForm.getDataVencimento());
        tarefa.setAgendamento(tarefaUpdateForm.getAgendamento());
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa updateCusto(Long id, TarefaUpdateForm tarefaUpdateForm) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tarefa não encontrada."));
        tarefa.setCusto(tarefaUpdateForm.getCusto());
        return tarefaRepository.save(tarefa);
    }
}
