package br.edu.up.telas;

import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import br.edu.up.util.*;
import br.edu.up.controle.ControleSeguro;
import br.edu.up.modelo.*;

public class Menu {
    ControleSeguro control = new ControleSeguro();
    ArrayList<SeguroVida> seguroVida = control.getSeguroVida();
    ArrayList<SeguroVeiculo> seguroVeiculo = control.getSeguroVeiculo();

    public void run() {
        while (true) {
            System.out.println("1. Incluir seguro");
            System.out.println("2: Localizar seguro ");
            System.out.println("3: Excluir seguro");
            System.out.println("4: Excluir todos os seguros ");
            System.out.println("5: Listar todos os seguros ");
            System.out.println("6: Ver quantidade de seguros ");
            System.out.println("7: sair do app");
            int resposta = Prompt.lerInteiro();
            switch (resposta) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosOsSeguros();
                    break;
                case 5:
                    listarTodosOsSeguros();
                    break;
                case 6:
                    verQuantidadeDeSeguros();
                    break;
                case 7:
                    sairDoApp();
                    break;

                default:
                    break;
            }
        }
    }

    public void incluirSeguro() {
        System.out.println("digite 1: se vc quiser o seguro de vida ");
        System.out.println("digite 2: se vc quiser o seguro de carro ");
        int op = Prompt.lerInteiro();
        switch (op) {
            case 1:
                seguroDeVida();
                break;
            case 2:
                seguroDecarro();
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }

    public void seguroDeVida() {
            boolean temApolicer = false;
            System.out.println("qual a sua apolice?");
            String apoliceUser = Prompt.lerLinha();
            for (SeguroVida segurovidas : seguroVida) {
                if (segurovidas.getApolice().equals(apoliceUser)){
                    System.out.println("ussuario ja existe");
                    temApolicer = true;
                    break;
                }
            }
                if (!temApolicer) {
                System.out.println("me diga seu nome");
                String nome = Prompt.lerLinha();
                System.out.println("RG");
                String rg = Prompt.lerLinha();
                System.out.println("sexo");
                String sexo = Prompt.lerLinha();
                System.out.println("telefone");
                String telefone = Prompt.lerLinha();
                System.out.println("endereço");
                String endereço = Prompt.lerLinha();
                System.out.println("cep");
                String cep = Prompt.lerLinha();
                System.out.println("cidade");
                String cidade = Prompt.lerLinha();
                Segurado segurado = new Segurado(nome, rg, sexo, telefone, endereço, cep, cidade);
                System.out.println("usuario registrado");
                System.out.println("parte final");
                System.out.println("qual o valor da apolicie");
                double valorApolicie = Prompt.lerDecimal();
                System.out.println("cobra doença ? (sim/nao)");
                String cobraDoença = Prompt.lerLinha();
                boolean cobraDoenca = true;
                switch (cobraDoença) {
                    case "sim":
                        cobraDoenca = true;
                        break;
                    case "nao":
                        cobraDoenca = false;
                        break;
                    default:
                        break;
                }

                System.out.println("cobra acidente ? (sim/nao)");
                String cobraAcidente = Prompt.lerLinha();
                boolean cobraAcidentes = true;
                switch (cobraAcidente) {
                    case "sim":
                        cobraAcidentes = true;
                        break;
                    case "nao":
                        cobraAcidentes = false;
                        break;
                    default:
                        break;
                }

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println("qual a data de inicio DD/MMM/AAAA");
                String dataInicio = Prompt.lerLinha();
                System.out.println("qual a data de saida DD/MMM/AAAA");
                String dataSaida = Prompt.lerLinha();
                try {
                    LocalDate dataInicios = LocalDate.parse(dataInicio, formatter);
                    LocalDate dataSaidas = LocalDate.parse(dataSaida, formatter);
                    SeguroVida novoSeguro = new SeguroVida(apoliceUser, segurado, valorApolicie, dataInicios,
                            dataSaidas, cobraDoenca, cobraAcidentes);
                    seguroVida.add(novoSeguro);
                } catch (DateTimeException e) {
                    System.out.println("formato de data invalid");
                }
        }
    }

    public void seguroDecarro() {

    }

    public void localizarSeguro() {

    }

    public void excluirSeguro() {

    }

    public void excluirTodosOsSeguros() {

    }

    public void listarTodosOsSeguros() {
        System.out.println("Seguros de Vida:");
        for (SeguroVida seguro : seguroVida) {
            if (seguro != null) {
                System.out.println("Apolice: " + seguro.getApolice());
                System.out.println("Segurado:");
                Segurado segurado = seguro.getSegurado();
                System.out.println("Nome: " + segurado.getNome());
                System.out.println("RG: " + segurado.getRG());
                System.out.println("Sexo: " + segurado.getSexo());
                System.out.println("Telefone: " + segurado.getTelefone());
                System.out.println("Endereço: " + segurado.getEndereço());
                System.out.println("CEP: " + segurado.getCEP());
                System.out.println("Cidade: " + segurado.getCidade());
                System.out.println("Valor da Apólice: " + seguro.getVlrApolice());
                System.out.println("Cobra doença? " + (seguro.isCobraDoenca() ? "Sim" : "Não"));
                System.out.println("Cobra acidentes? " + (seguro.isCobraAcidente() ? "Sim" : "Não"));
                System.out.println("Data de Início: " + seguro.getDtaInicio());
                System.out.println("Data de Saída: " + seguro.getDarFim());
                System.out.println("---------------------------------");
            } else {
                System.out.println("Posição nula");
            }
        }
    }
    

    public void verQuantidadeDeSeguros() {

    }

    public void sairDoApp() {

    }

}
