package br.com.jogoanimais.jogodeanimais.controller;


import br.com.jogoanimais.jogodeanimais.domain.Aquatico;
import br.com.jogoanimais.jogodeanimais.domain.Terrestre;
import br.com.jogoanimais.jogodeanimais.repo.Operador;

import javax.swing.*;

public class Start {

    public Class<?> start() {
        //Mensagem utilizada ao cancelar a tela de digitar animal e seu verbo
        String msg = "INFORME ALGUM VALOR!";

        // Variáveis para gerar até 100 animais
        int i = 0;
        int max = 100;

        // Acesso aos Arrays dos Objetos
        Operador op = new Operador();

        // laço de até 100 vezes de toda a aplicação
        while (i < max) {

            // Pergunta inicial
            int primeiraPerg = JOptionPane.showConfirmDialog(null, "Pense em um animal.",
                    "Jogo dos animais", JOptionPane.OK_CANCEL_OPTION);

            //Sair do programa na pergunta inicial
            if (primeiraPerg == 2) {
                System.exit(0);
            }

            // Segunda pergunta
            int segundaPerg = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?",
                            "Informe", JOptionPane.YES_NO_OPTION);

            //Primeiro ciclo dos animais aquáticos
            if (segundaPerg == 0) {


                if (op.getAquaticos().size() == 0) {

                    // Pré percistindo o primeiro do array de aquaticos
                    op.prePercistAquatico();

                    int pergInicialAquaticos = JOptionPane.showConfirmDialog(null, "O peixe que você pensou é " + op.getAquaticos().get(0).getNome() + " ?",
                            "Informe", JOptionPane.YES_NO_OPTION);

                    if (pergInicialAquaticos == 0) {
                        JOptionPane.showMessageDialog(null, "Eu venci!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                        i++;
                        continue;
                    } else {

                        Aquatico aq = new Aquatico();

                        aq.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));

                        while (aq.getNome() == null) {
                            JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                            aq.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));
                        }

                        aq.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + aq.getNome() + "_________ mas um(a) "
                                + op.getAquaticos().get(0).getNome() + " não."));

                        while (aq.getVerbo() == null) {
                            JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                            aq.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + aq.getNome() + "_________ mas um(a) "
                                    + op.getAquaticos().get(0).getNome() + " não."));
                        }
                        op.adicionarAquatico(aq);
                        continue;
                    }
                }
                if (op.getAquaticos().size() >= 1) {

                    for (int y = 0; y < op.getAquaticos().size(); y++) {
                        int perg = -1;

                        while (perg != 0) {
                            if(y != op.getAquaticos().size()) {
                                perg = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + op.getAquaticos().get(y).getVerbo() + " ?",
                                        "Informe", JOptionPane.YES_NO_OPTION);
                                break;
                            }
                        }


                        if (perg == 0) {
                            int objConfirmacao = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + op.getAquaticos().get(y).getNome() + " ?",
                                    "Informe", JOptionPane.YES_NO_OPTION);

                            if (objConfirmacao == 0) {
                                JOptionPane.showMessageDialog(null, "Eu venci!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else if (objConfirmacao != 0) {

                                Aquatico aquaticoObjConfirmacao = new Aquatico();
                                aquaticoObjConfirmacao.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));

                                while (aquaticoObjConfirmacao.getNome() == null) {
                                    JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                    aquaticoObjConfirmacao.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));
                                }

                                aquaticoObjConfirmacao.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + aquaticoObjConfirmacao.getNome() + "_________ mas um(a) "
                                        + op.getAquaticos().get(0).getNome() + " não."));

                                while (aquaticoObjConfirmacao.getVerbo() == null) {
                                    JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                    aquaticoObjConfirmacao.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + aquaticoObjConfirmacao.getNome() + "_________ mas um(a) "
                                            + op.getAquaticos().get(0).getNome() + " não."));
                                }
                                op.adicionarAquatico(aquaticoObjConfirmacao);
                                break;
                            }
                        } else if (perg == 1 && y == op.getAquaticos().size() - 1) {
                            Aquatico aqSemVerbo = new Aquatico();
                            aqSemVerbo.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));

                            while (aqSemVerbo.getNome() == null) {
                                JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                aqSemVerbo.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));
                            }

                            aqSemVerbo.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + aqSemVerbo.getNome() + "_________ mas um(a) "
                                    + op.getAquaticos().get(0).getNome() + " não."));

                            while (aqSemVerbo.getVerbo() == null) {
                                JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                aqSemVerbo.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + aqSemVerbo.getNome() + "_________ mas um(a) "
                                        + op.getAquaticos().get(0).getNome() + " não."));
                            }
                            op.adicionarAquatico(aqSemVerbo);
                            break;

                        }
                    }
                }
            } else if (segundaPerg == 1) {
                if (op.getTerrestres().size() == 0) {
                    op.prePercistTerrestre();
                    int pergInicialTerrestres = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + op.getTerrestres().get(0).getNome() + " ?",
                            "Informe", JOptionPane.YES_NO_OPTION);
                    if (pergInicialTerrestres == 0) {
                        JOptionPane.showMessageDialog(null, "Eu venci!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                        i++;
                        continue;
                    } else {
                        Terrestre ter = new Terrestre();
                        ter.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));

                        while (ter.getNome() == null) {
                            JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                            ter.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));
                        }

                        ter.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + ter.getNome() + "_________ mas um(a) "
                                + op.getTerrestres().get(0).getNome() + " não."));

                        while (ter.getVerbo() == null) {
                            JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                            ter.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + ter.getNome() + "_________ mas um(a) "
                                    + op.getTerrestres().get(0).getNome() + " não."));
                        }
                        op.adicionarTerrestre(ter);
                        continue;
                    }
                }
                if (op.getTerrestres().size() >= 1) {

                    for (int y = 0; y < op.getTerrestres().size(); y++) {
                        int perg = -1;

                        while (perg != 0) {

                            if(y != op.getTerrestres().size()) {
                            perg = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + op.getTerrestres().get(y).getVerbo() + " ?",
                                    "Informe", JOptionPane.YES_NO_OPTION);
                                break;
                            }
                        }


                        if (perg == 0) {
                            int objConfirmacao = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + op.getTerrestres().get(y).getNome() + " ?",
                                    "Informe", JOptionPane.YES_NO_OPTION);

                            if (objConfirmacao == 0) {
                                JOptionPane.showMessageDialog(null, "Eu venci!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else if (objConfirmacao != 0) {

                                Terrestre terrestreObjConfirmacao = new Terrestre();
                                terrestreObjConfirmacao.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));

                                while (terrestreObjConfirmacao.getNome() == null) {
                                    JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                    terrestreObjConfirmacao.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));
                                }

                                terrestreObjConfirmacao.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + terrestreObjConfirmacao.getNome() + "_________ mas um(a) "
                                        + op.getTerrestres().get(0).getNome() + " não."));

                                while (terrestreObjConfirmacao.getVerbo() == null) {
                                    JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                    terrestreObjConfirmacao.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + terrestreObjConfirmacao.getNome() + "_________ mas um(a) "
                                            + op.getTerrestres().get(0).getNome() + " não."));
                                }
                                op.adicionarTerrestre(terrestreObjConfirmacao);
                                break;
                            }
                        } else if (perg == 1 && y == op.getTerrestres().size() - 1) {
                            Terrestre terSemVerbo = new Terrestre();
                            terSemVerbo.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));

                            while (terSemVerbo.getNome() == null) {
                                JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                terSemVerbo.setNome(JOptionPane.showInputDialog(null, "Qual animal que você pensou?"));
                            }

                            terSemVerbo.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + terSemVerbo.getNome() + "_________ mas um(a) "
                                    + op.getTerrestres().get(0).getNome() + " não."));

                            while (terSemVerbo.getVerbo() == null) {
                                JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.ERROR_MESSAGE);
                                terSemVerbo.setVerbo(JOptionPane.showInputDialog(null, "Um(a) " + terSemVerbo.getNome() + "_________ mas um(a) "
                                        + op.getTerrestres().get(0).getNome() + " não."));
                            }
                            op.adicionarTerrestre(terSemVerbo);
                            break;


                        }
                    }
                }
            }
            i++;
        }
        return null;
    }
}







