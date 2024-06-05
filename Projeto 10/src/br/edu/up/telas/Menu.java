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
        boolean loop = true;
        while (loop) {
            System.out.println("1. Incluir seguro");                // true
            System.out.println("2: Localizar seguro ");             // true
            System.out.println("3: Excluir seguro");                // true
            System.out.println("4: Excluir todos os seguros ");     // true
            System.out.println("5: Listar todos os seguros ");      // true
            System.out.println("6: Ver quantidade de seguros ");    // true
            System.out.println("7: sair do app");                   // true
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
                    loop = false;
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
            if (segurovidas.getApolice().equals(apoliceUser)) {
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
        boolean temApolicer = false;
        System.out.println("qual a sua apolice?");
        String apoliceUser = Prompt.lerLinha();
        for (SeguroVeiculo seguroVeiculos : seguroVeiculo) {
            if (seguroVeiculos.getApolice().equals(apoliceUser)) {
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

            System.out.println("temCarroReserva ? (sim/nao)");
            String cobraAcidente = Prompt.lerLinha();
            boolean temCarroReserva = true;
            switch (cobraAcidente) {
                case "sim":
                    temCarroReserva = true;
                    break;
                case "nao":
                    temCarroReserva = false;
                    break;
                default:
                    break;
            }

            System.out.println("cobre vidro ? (sim/nao)");
            String cobreVidero = Prompt.lerLinha();
            boolean cobreVideros = true;
            switch (cobreVidero) {
                case "sim":
                    cobreVideros = true;
                    break;
                case "nao":
                    cobreVideros = false;
                    break;
                default:
                    break;
            }

            System.out.println("qual o valor da franquia ?");
            double valorFranqui = Prompt.lerDecimal();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("qual a data de inicio DD/MMM/AAAA");
            String dataInicio = Prompt.lerLinha();
            System.out.println("qual a data de saida DD/MMM/AAAA");
            String dataSaida = Prompt.lerLinha();
            try {
                LocalDate dataInicios = LocalDate.parse(dataInicio, formatter);
                LocalDate dataSaidas = LocalDate.parse(dataSaida, formatter);
                SeguroVeiculo novoSeguroVeiculo = new SeguroVeiculo(apoliceUser, segurado, valorApolicie, dataInicios,
                        dataSaidas, valorFranqui, temCarroReserva, cobreVideros);
                seguroVeiculo.add(novoSeguroVeiculo);
            } catch (DateTimeException e) {
                System.out.println("formato de data invalid");
            }
        }
    }

    public void localizarSeguro() {
        System.out.println("seguro de carro ou seguro de vida? (carro/vida)");
        String resposta = Prompt.lerLinha();
        switch (resposta) {
            case "carro":
                System.out.println("qual é seu nome ?");
                String supostoNome = Prompt.lerLinha();
                System.out.println("qual é seu rg ?");
                String supostoRg = Prompt.lerLinha();
                for (SeguroVeiculo seguroVeiculo2 : seguroVeiculo) {
                    if (seguroVeiculo2.getSegurado().getNome().equals(supostoNome)
                            && seguroVeiculo2.getSegurado().getRG().equals(supostoRg)) {
                        for (SeguroVeiculo seguroVeiculo3 : seguroVeiculo) {
                            System.out.println("Apolice: " + seguroVeiculo3.getApolice());
                            System.out.println("Segurado:");
                            Segurado segurado = seguroVeiculo3.getSegurado();
                            System.out.println("Nome: " + segurado.getNome());
                            System.out.println("RG: " + segurado.getRG());
                            System.out.println("Sexo: " + segurado.getSexo());
                            System.out.println("Telefone: " + segurado.getTelefone());
                            System.out.println("Endereço: " + segurado.getEndereço());
                            System.out.println("CEP: " + segurado.getCEP());
                            System.out.println("Cidade: " + segurado.getCidade());
                            System.out.println("Valor da Apólice: " + seguroVeiculo3.getVlrApolice());
                            System.out.println("Cobra doença? " + (seguroVeiculo3.isCobreVidros() ? "Sim" : "Não"));
                            System.out.println(
                                    "Cobra acidentes? " + (seguroVeiculo3.isTemCarroReserva() ? "Sim" : "Não"));
                            System.out.println("Data de Início: " + seguroVeiculo3.getDtaInicio());
                            System.out.println("Data de Saída: " + seguroVeiculo3.getDarFim());
                            System.out.println("---------------------------------");
                        }
                    }

                }
                break;

            case "vida":
                System.out.println("qual é seu nome ?");
                String supostoNomeV = Prompt.lerLinha();
                System.out.println("qual é seu rg ?");
                String supostoRgV = Prompt.lerLinha();
                for (SeguroVida seguroVidat : seguroVida) {
                    if (seguroVidat.getSegurado().getNome().equals(supostoNomeV)
                            && seguroVidat.getSegurado().getRG().equals(supostoRgV)) {
                        for (SeguroVida seguroVidatt : seguroVida) {
                            System.out.println("Apolice: " + seguroVidatt.getApolice());
                            System.out.println("Segurado:");
                            Segurado segurado = seguroVidatt.getSegurado();
                            System.out.println("Nome: " + segurado.getNome());
                            System.out.println("RG: " + segurado.getRG());
                            System.out.println("Sexo: " + segurado.getSexo());
                            System.out.println("Telefone: " + segurado.getTelefone());
                            System.out.println("Endereço: " + segurado.getEndereço());
                            System.out.println("CEP: " + segurado.getCEP());
                            System.out.println("Cidade: " + segurado.getCidade());
                            System.out.println("Valor da Apólice: " + seguroVidatt.getVlrApolice());
                            System.out.println("Cobra doença? " + (seguroVidatt.isCobraAcidente() ? "Sim" : "Não"));
                            System.out.println(
                                    "Cobra acidentes? " + (seguroVidatt.isCobraDoenca() ? "Sim" : "Não"));
                            System.out.println("Data de Início: " + seguroVidatt.getDtaInicio());
                            System.out.println("Data de Saída: " + seguroVidatt.getDarFim());
                            System.out.println("---------------------------------");
                        }
                    }

                }
            default:
                break;
        }
    }

    public void excluirSeguro() {
        System.out.println("deletar o seguro de carro  (1)");
        System.out.println("deletar seguro de vida     (2)");
        int resposta = Prompt.lerInteiro();
        switch (resposta) {
            case 1:
                System.out.println("qual seu nome");
                String supostoNome = Prompt.lerLinha();
                System.out.println("qual é seu rg ?");
                String supostoRg = Prompt.lerLinha();
                System.out.println("me diga sua apolicie");
                String supostaApolicie = Prompt.lerLinha();
                for (SeguroVeiculo seguroVeiculo22 : seguroVeiculo) {
                    if (seguroVeiculo22.getSegurado().getNome().equals(supostoNome)
                            && seguroVeiculo22.getSegurado().getRG().equals(supostoRg)
                            && seguroVeiculo22.getApolice().equals(supostaApolicie)) {
                        seguroVeiculo.remove(seguroVeiculo22);
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("qual seu nome");
                String supostoNomev = Prompt.lerLinha();
                System.out.println("qual é seu rg ?");
                String supostoRgV = Prompt.lerLinha();
                System.out.println("me diga sua apolicie");
                String supostaApolicieV = Prompt.lerLinha();
                for (SeguroVida seguroVida22 : seguroVida) {
                    if (seguroVida22.getSegurado().getNome().equals(supostoNomev)
                            && seguroVida22.getSegurado().getRG().equals(supostoRgV)
                            && seguroVida22.getApolice().equals(supostaApolicieV)) {
                        seguroVida.remove(seguroVida22);
                        break;
                    }
                }
                break;
            default:
                break;
        }

    }

    public void excluirTodosOsSeguros() {
        System.out.println("vc vai deletar os seguros de vida digite 1");
        System.out.println("            ou");
        System.out.println("vai deletar os seguros de carros digite 2");
        int res = Prompt.lerInteiro();
        System.out.println("digite a senha");
        int suspostaSenha = Prompt.lerInteiro();
        int senha = 123;
        if (suspostaSenha == senha) {
            switch (res) {
                case 1:
                    seguroVida.clear();
                    System.err.println("TODOS OS SEGUROS DE VIDA FORAM DELETADOS");
                    break;
                case 2:
                    seguroVeiculo.clear();
                    System.out.println("TODOS OS SEGUROS DE CARRO FORAM DELETADOS");
                    break;

                default:
                    break;
            }
        }

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
        System.out.println("Seguros de carro:");
        for (SeguroVeiculo seguroDoVeiculo : seguroVeiculo) {
            if (seguroDoVeiculo != null) {
                System.out.println("Apolice: " + seguroDoVeiculo.getApolice());
                System.out.println("Segurado:");
                Segurado segurado = seguroDoVeiculo.getSegurado();
                System.out.println("Nome: " + segurado.getNome());
                System.out.println("RG: " + segurado.getRG());
                System.out.println("Sexo: " + segurado.getSexo());
                System.out.println("Telefone: " + segurado.getTelefone());
                System.out.println("Endereço: " + segurado.getEndereço());
                System.out.println("CEP: " + segurado.getCEP());
                System.out.println("Cidade: " + segurado.getCidade());
                System.out.println("Valor da Apólice: " + seguroDoVeiculo.getVlrApolice());
                System.out.println("Cobra doença? " + (seguroDoVeiculo.isCobreVidros() ? "Sim" : "Não"));
                System.out.println("Cobra acidentes? " + (seguroDoVeiculo.isTemCarroReserva() ? "Sim" : "Não"));
                System.out.println("Data de Início: " + seguroDoVeiculo.getDtaInicio());
                System.out.println("Data de Saída: " + seguroDoVeiculo.getDarFim());
                System.out.println("---------------------------------");
            } else {
                System.out.println("Posição nula");
            }
        }
    }

    public void verQuantidadeDeSeguros() {
        System.out.println("digite 1 para ver os seguros de vida");
        System.out.println("digite 2 para seguros de carro");
        int ress = Prompt.lerInteiro();
        switch (ress) {
            case 1:
            int count = 0;
            for (SeguroVida segur : seguroVida) {
                count ++;
            }
            System.out.println("existem no total " + count + " seguros de vida");
                break;
            case 2:
            int countv = 0;
            for (SeguroVeiculo segur : seguroVeiculo) {
                countv ++;
            }
            System.out.println("existem no total " + countv + " seguros de carro");
                break;

            default:
                break;
        }
    }

}
