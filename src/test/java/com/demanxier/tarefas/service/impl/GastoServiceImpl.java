package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.form.GastoForm;
import com.demanxier.tarefas.repository.GastoRepository;
import com.demanxier.tarefas.service.IGastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoServiceImpl implements IGastoService {

    @Autowired
    private GastoRepository gastoRepository;

    @Override
    public Gasto create(GastoForm gastoForm) {
        Gasto gasto = new Gasto();
        gasto.setDescricao(gastoForm.getDescricao());
        gasto.setValor(gastoForm.getValor());
        gasto.setParcelas(gastoForm.getParcelas());
        gasto.setParcelasVencimentos(gastoForm.getParcelasVencimentos());
        gasto.setDataGastos(gastoForm.getDataGastos());
        gasto.setTipoGasto(gastoForm.getTipoGasto());
        gasto.setCartao(gastoForm.getCartao());
        return gastoRepository.save(gasto);
    }

    @Override
    public Gasto get(Long id) {
        return gastoRepository.findById(id).get();
    }

    @Override
    public List<Gasto> getAll() {
        return gastoRepository.findAll();
    }

    @Override
    public Gasto update(Long id, GastoForm gastoForm) {
        Gasto gasto = gastoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Essa gasto não foi encontrado."));

        gasto.setDescricao(gastoForm.getDescricao());
        gasto.setValor(gastoForm.getValor());
        gasto.setParcelas(gastoForm.getParcelas());
        gasto.setParcelasVencimentos(gastoForm.getParcelasVencimentos());
        gasto.setDataGastos(gastoForm.getDataGastos());
        gasto.setTipoGasto(gastoForm.getTipoGasto());
        gasto.setCartao(gastoForm.getCartao());

        return gastoRepository.save(gasto);
    }

    @Override
    public void delete(Long id) {
        Gasto gasto = gastoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Essa gasto não foi encontrado."));
        gastoRepository.delete(gasto);
    }
}
