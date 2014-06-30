package telas;
import classes.Produto;
import classes.ProdutoVenda;
import classes.Usuario;
import classes.Venda;
import funcoes.Rotinas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//----------------------------------------------------	
public class GUI_venda extends javax.swing.JInternalFrame {
    
//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================
	 
	EntityManager gerenciador;
	Query consulta;
	List<ProdutoVenda> lista;
	ProdutoVenda produtoVenda = new ProdutoVenda();
	Rotinas rotina = new Rotinas();
	Produto produto = new Produto();
	Usuario usuario = new Usuario();
	Venda venda = new Venda();
	String tabela = "Venda";
	double total = 0;
	String alterador = "salva";// Variavel para alteração da função do 'btn_salvar'

//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
    
        public GUI_venda() {
                initComponents();
                ReiniciaFormulario();
		this.CriaTabela();
        }//CONSTRUTOR

//=========================================================================================
//	CÓDIGO GERADO AUTOMÁTICAMENTE
//=========================================================================================
	   
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl_principal = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_informacoes = new javax.swing.JPanel();
        lbl_vendedor = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_v = new javax.swing.JLabel();
        lbl_cv = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        pnl_acoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_primeiro = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_localizar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        pnl_produto = new javax.swing.JPanel();
        lbl_quantidade_produto = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        lbl_itens = new javax.swing.JLabel();
        txt_quantidade_produto = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_itens = new javax.swing.JTable();
        txt_busca_produto = new javax.swing.JTextField();
        lbl_busca_produto = new javax.swing.JLabel();
        lbl_pagamento = new javax.swing.JLabel();
        box_pagamanto = new javax.swing.JComboBox();
        btn_adicionar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Vendas");
        setPreferredSize(new java.awt.Dimension(455, 545));
        setRequestFocusEnabled(false);

        pnl_principal.setPreferredSize(new java.awt.Dimension(520, 460));
        pnl_principal.setRequestFocusEnabled(false);

        pnl_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 102, 153));
        lbl_titulo.setText("Formulário de Venda");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_informacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_vendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_vendedor.setForeground(new java.awt.Color(102, 102, 102));
        lbl_vendedor.setText("Nome do vendedor");

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(102, 102, 102));
        lbl_codigo.setText("Código");

        lbl_v.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_v.setForeground(new java.awt.Color(0, 102, 153));
        lbl_v.setText("Vendedor:");

        lbl_cv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv.setText("Código da venda:");

        lbl_data.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_data.setForeground(new java.awt.Color(102, 102, 102));

        lbl_hora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_hora.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnl_informacoesLayout = new javax.swing.GroupLayout(pnl_informacoes);
        pnl_informacoes.setLayout(pnl_informacoesLayout);
        pnl_informacoesLayout.setHorizontalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_informacoesLayout.createSequentialGroup()
                        .addComponent(lbl_cv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_data))
                    .addGroup(pnl_informacoesLayout.createSequentialGroup()
                        .addComponent(lbl_v)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_vendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_hora)))
                .addContainerGap())
        );
        pnl_informacoesLayout.setVerticalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv)
                    .addComponent(lbl_codigo)
                    .addComponent(lbl_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_v)
                    .addComponent(lbl_vendedor)
                    .addComponent(lbl_hora))
                .addContainerGap())
        );

        pnl_acoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_novo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(102, 102, 102));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(102, 102, 102));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_anterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_anterior.setForeground(new java.awt.Color(102, 102, 102));
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_primeiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_primeiro.setForeground(new java.awt.Color(102, 102, 102));
        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_proximo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_proximo.setForeground(new java.awt.Color(102, 102, 102));
        btn_proximo.setText("Próximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ultimo.setForeground(new java.awt.Color(102, 102, 102));
        btn_ultimo.setText("Último");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_localizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_localizar.setForeground(new java.awt.Color(102, 102, 102));
        btn_localizar.setText("Localizar");
        btn_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localizarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(102, 102, 102));
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_acoesLayout = new javax.swing.GroupLayout(pnl_acoes);
        pnl_acoes.setLayout(pnl_acoesLayout);
        pnl_acoesLayout.setHorizontalGroup(
            pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acoesLayout.createSequentialGroup()
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_localizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_acoesLayout.setVerticalGroup(
            pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acoesLayout.createSequentialGroup()
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_localizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_novo))
                .addGap(0, 0, 0)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_produto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_quantidade_produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_quantidade_produto.setForeground(new java.awt.Color(0, 102, 153));
        lbl_quantidade_produto.setText("Quantidade");

        lbl_valor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_valor.setForeground(new java.awt.Color(102, 102, 102));
        lbl_valor.setText("Valor");

        lbl_itens.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_itens.setForeground(new java.awt.Color(0, 102, 153));
        lbl_itens.setText("Itens da venda");

        txt_quantidade_produto.setBackground(new java.awt.Color(255, 255, 204));
        txt_quantidade_produto.setForeground(new java.awt.Color(102, 102, 102));

        lbl_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(0, 102, 153));
        lbl_total.setText("Total R$");

        tbl_itens.setBackground(new java.awt.Color(255, 255, 204));
        tbl_itens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_itens.setForeground(new java.awt.Color(102, 102, 102));
        tbl_itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_itens.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tbl_itens.setSelectionForeground(new java.awt.Color(51, 51, 255));
        tbl_itens.getTableHeader().setResizingAllowed(false);
        tbl_itens.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_itens);

        txt_busca_produto.setBackground(new java.awt.Color(255, 255, 204));
        txt_busca_produto.setForeground(new java.awt.Color(102, 102, 102));

        lbl_busca_produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_busca_produto.setForeground(new java.awt.Color(0, 102, 153));
        lbl_busca_produto.setText("Cod. produto");

        lbl_pagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_pagamento.setForeground(new java.awt.Color(0, 102, 153));
        lbl_pagamento.setText("Pagamento em:");

        box_pagamanto.setBackground(new java.awt.Color(255, 255, 204));
        box_pagamanto.setForeground(new java.awt.Color(102, 102, 102));
        box_pagamanto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão" }));

        btn_adicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_adicionar.setForeground(new java.awt.Color(102, 102, 102));
        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_remover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_remover.setForeground(new java.awt.Color(102, 102, 102));
        btn_remover.setText("Remover produto");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_finalizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_finalizar.setForeground(new java.awt.Color(102, 102, 102));
        btn_finalizar.setText("Finalizar");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_produtoLayout = new javax.swing.GroupLayout(pnl_produto);
        pnl_produto.setLayout(pnl_produtoLayout);
        pnl_produtoLayout.setHorizontalGroup(
            pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnl_produtoLayout.createSequentialGroup()
                        .addComponent(lbl_total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_produtoLayout.createSequentialGroup()
                        .addComponent(lbl_itens)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_produtoLayout.createSequentialGroup()
                        .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pagamento)
                            .addComponent(box_pagamanto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_busca_produto)
                            .addComponent(txt_busca_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_produtoLayout.createSequentialGroup()
                                .addComponent(lbl_quantidade_produto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnl_produtoLayout.createSequentialGroup()
                                .addComponent(txt_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnl_produtoLayout.setVerticalGroup(
            pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_quantidade_produto)
                    .addComponent(lbl_busca_produto)
                    .addComponent(lbl_pagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_pagamanto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_busca_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl_itens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total)
                    .addComponent(lbl_valor)
                    .addComponent(btn_remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_informacoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_acoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//=========================================================================================
//	AÇÕES
//=========================================================================================
	    
         private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed

		this.alterador = "salva";
                  this.btn_finalizar.setEnabled(true);
                  this.btn_cancelar.setEnabled(true);
                  this.btn_novo.setEnabled(false);
                  this.btn_localizar.setEnabled(false);
		this.txt_busca_produto.setEnabled(true);
		this.txt_quantidade_produto.setEnabled(true);
		this.btn_adicionar.setEnabled(true);
		this.tbl_itens.setEnabled(true);
		this.btn_remover.setEnabled(true);
		this.box_pagamanto.setEnabled(true);
		this.lbl_codigo.setText("1");
		this.lbl_vendedor.setText(""+GUI_principal.nome);
		
                  gerenciador =rotina.Conectar();//ABRE A CONEXÃO
                  venda = (Venda)rotina.MostraCodigo(gerenciador, tabela);
                  this.lbl_codigo.setText(""+(venda.getId()+1));//FAZ A PREMONIÇÃO DO CODIGO
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO

         }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
	this.ReiniciaFormulario();
		
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        
		gerenciador = rotina.Conectar();
		
		int quantidade = Integer.parseInt(this.txt_quantidade_produto.getText());
		produto = rotina.AdicionaIten(gerenciador, Integer.parseInt(this.txt_busca_produto.getText()));
		
		
		DefaultTableModel tbl_def = (DefaultTableModel)this.tbl_itens.getModel();
		tbl_def.addRow(new Object[] {produto.getId(), produto.getNome(), produto.getValorVenda(), quantidade});
		
		double item = produto.getValorVenda()*quantidade;
		this.total += item;
		this.lbl_valor.setText(""+total);
		
		rotina.Fechar(gerenciador);
		
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        
        int linha  = this.tbl_itens.getSelectedRow();
        double vlr = (Double)this.tbl_itens.getModel().getValueAt(linha, 2);
        int qtd = (Integer)this.tbl_itens.getModel().getValueAt(linha, 3);
        double item = qtd * vlr;
        total -= item;
        this.lbl_valor.setText(""+total);
        
        ((DefaultTableModel) this.tbl_itens.getModel()).removeRow(linha);
        
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed

//			SALVAR UMA NOVA VENDA
		if(alterador.equals("salva")){
			
			gerenciador = rotina.Conectar();

			venda.setId(null);
			venda.setData(GUI_principal.data);
			venda.setHora(GUI_principal.hora);
			venda.setPagamento((String)this.box_pagamanto.getSelectedItem());

			//Usuário da Venda
			consulta = gerenciador.createQuery("select c from Usuario c where c.id = :id");
			consulta.setParameter("id", GUI_principal.codigo);
			usuario = (Usuario) consulta.getSingleResult();
			venda.setUsuario(usuario);

			rotina.Persistir(gerenciador, venda);//SALVA A VENDA
			rotina.Fechar(gerenciador);

			for(int i = 0  ; this.tbl_itens.getModel().getRowCount() > 0 ; ++i ){

				gerenciador = rotina.Conectar();
				//Preenchendo Entidade 'produtoVenda'
				produtoVenda.setId(null);
				//Seta a venda do item
				consulta = gerenciador.createQuery("select c from Venda c order by c.id desc");//HQL
				consulta.setMaxResults(1);//Captura o último registro
				venda = (Venda)consulta.getSingleResult();
				produtoVenda.setVenda(venda);//Adiciona a venda que foi criada
				//===================================================
				int id = (Integer) this.tbl_itens.getModel().getValueAt(0, 0);
				consulta = gerenciador.createQuery("select c from Produto c where c.id = :id");
				consulta.setParameter("id", id);
				produto = (Produto) consulta.getSingleResult();
				produtoVenda.setProduto(produto);//Adiciona o produto
				//Salva a quantidade que foi vendida
				int qtd = (Integer) this.tbl_itens.getModel().getValueAt(0, 3);
				produtoVenda.setQuantidade(qtd);//Adiciona o produto

				rotina.Persistir(gerenciador, produtoVenda);//SALVA O ITEM DA VENDA
				rotina.Fechar(gerenciador);

				((DefaultTableModel) this.tbl_itens.getModel()).removeRow(0);

			}//FOR
			
			JOptionPane.showMessageDialog(null, "Venda finalizada.");

			this.ReiniciaFormulario();
		
		}//IF
		//-----------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		//	ALTERA UMA VENDA EXISTENTE
		if(alterador.equals("altera")){
			
			int op1 = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta venda ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                                             if(op1 == 0){
									
						gerenciador = rotina.Conectar();
						//--------------------------------------------------------------------
						//	DELETA A TABELA ATUAL
						consulta = gerenciador.createQuery("select c from Venda c where c.id = :id");
						consulta.setParameter("id", Integer.parseInt(this.lbl_codigo.getText()));
						venda = (Venda)consulta.getSingleResult();
						//==============================================================
						consulta = gerenciador.createQuery("select c from ProdutoVenda c where c.venda = :venda");
						consulta.setParameter("venda", venda);
						lista = (List<ProdutoVenda>)consulta.getResultList();
						
						for(ProdutoVenda v : lista){
							rotina.Deletar(gerenciador, v);
						}//FOR
						
						rotina.Fechar(gerenciador);
						//--------------------------------------------------------------------
						
                                                      //--------------------------------------------------------------------
						//	PREENCHE A NOVA TABELA
						
						
						for(int i = 0  ; this.tbl_itens.getModel().getRowCount() > 0 ; ++i ){
							gerenciador = rotina.Conectar();
							
							//Preenchendo Entidade 'produtoVenda'
							produtoVenda.setId(null);
							//Seta a venda do item
							consulta = gerenciador.createQuery("select c from Venda c order by c.id desc");//HQL
							consulta.setMaxResults(1);//Captura o último registro
							venda = (Venda)consulta.getSingleResult();
							produtoVenda.setVenda(venda);//Adiciona a venda que foi criada
							//===================================================
							int id = (Integer) this.tbl_itens.getModel().getValueAt(0, 0);
							consulta = gerenciador.createQuery("select c from Produto c where c.id = :id");
							consulta.setParameter("id", id);
							produto = (Produto) consulta.getSingleResult();
							produtoVenda.setProduto(produto);//Adiciona o produto
							//Salva a quantidade que foi vendida
							int qtd = (Integer) this.tbl_itens.getModel().getValueAt(0, 3);
							produtoVenda.setQuantidade(qtd);//Adiciona o produto

							rotina.Persistir(gerenciador, produtoVenda);//SALVA O ITEM DA VENDA
							rotina.Fechar(gerenciador);

							((DefaultTableModel) this.tbl_itens.getModel()).removeRow(0);

						}//FOR
                                                      //--------------------------------------------------------------------
						
						JOptionPane.showMessageDialog(null, "Venda alterada.");
						
						this.ReiniciaFormulario();
						
					}//IF
						
			
		}//IF
		//--------------------------------------------------------------------------------------------------
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void btn_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localizarActionPerformed
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da venda", "Busca por venda", JOptionPane.QUESTION_MESSAGE));
		
		try{//TRATAMENTO DE ERRO
		
			//-------------------------------------------------------------------------
			//	REINICIA O FORMULÁRIO
			this.ReiniciaFormulario();
			//-------------------------------------------------------------------------
			
			gerenciador = rotina.Conectar();
			//-------------------------------------------------------------------------
			//	REALIZANDO A BUSCA
			consulta = gerenciador.createQuery("select c from Venda c where c.id = :id");
			consulta.setParameter("id", codigo);
			venda = (Venda)consulta.getSingleResult();
			//-------------------------------------------------------------------------

			//-------------------------------------------------------------------------
			//	PREENCHENDO OS DADOS DA VENDA
			this.lbl_codigo.setText(""+venda.getId());
			this.lbl_data.setText(venda.getData());
			this.lbl_hora.setText(venda.getHora());
			this.lbl_vendedor.setText(venda.getUsuario().getNome());
			this.box_pagamanto.setSelectedItem(venda.getPagamento());
			//---------------------------------------------------------------------------

			//---------------------------------------------------------------------------
			//	PREENCHENDA A TABELA COM OS ITENS
			for(int i = 0 ; i < venda.getProdutoVendaList().size() ; i ++){

				produtoVenda = venda.getProdutoVendaList().get(i);
				DefaultTableModel tbl_def = (DefaultTableModel)this.tbl_itens.getModel();
				tbl_def.addRow(new Object[] {produtoVenda.getProduto().getId(), produtoVenda.getProduto().getNome(), 
					produtoVenda.getProduto().getValorVenda(), produtoVenda.getQuantidade()});
				double item = produtoVenda.getProduto().getValorVenda()*produtoVenda.getQuantidade();
				this.total += item;
			}//FOR

				this.lbl_valor.setText(""+total);
			//---------------------------------------------------------------------------

			//---------------------------------------------------------------------------
			//	ORGANIZA O FORMULÁRIO
			this.btn_novo.setEnabled(false);
			this.btn_cancelar.setEnabled(true);
			this.btn_anterior.setEnabled(true);
			this.btn_proximo.setEnabled(true);
			this.btn_primeiro.setEnabled(true);
			this.btn_ultimo.setEnabled(true);
			this.btn_alterar.setEnabled(true);
			//---------------------------------------------------------------------------

			rotina.Fechar(gerenciador);
		
		}catch(Exception ex){
		
			JOptionPane.showMessageDialog(null, "ERRO !");
		
		}//TRY / CATCH
		
    }//GEN-LAST:event_btn_localizarActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        
		gerenciador = rotina.Conectar();
                  venda = (Venda)rotina.Anterior(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);
				  
		//-------------------------------------------------------------------------
		//	REINICIA O FORMULÁRIO
		this.ReiniciaFormulario();
		//-------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------
		//	PREENCHENDO OS DADOS DA VENDA
		this.lbl_codigo.setText(""+venda.getId());
		this.lbl_data.setText(venda.getData());
		this.lbl_hora.setText(venda.getHora());
		this.lbl_vendedor.setText(venda.getUsuario().getNome());
		this.box_pagamanto.setSelectedItem(venda.getPagamento());
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	PREENCHENDA A TABELA COM OS ITENS
		for(int i = 0 ; i < venda.getProdutoVendaList().size() ; i ++){

			produtoVenda = venda.getProdutoVendaList().get(i);
			DefaultTableModel tbl_def = (DefaultTableModel)this.tbl_itens.getModel();
			tbl_def.addRow(new Object[] {produtoVenda.getProduto().getId(), produtoVenda.getProduto().getNome(), 
				produtoVenda.getProduto().getValorVenda(), produtoVenda.getQuantidade()});
			double item = produtoVenda.getProduto().getValorVenda()*produtoVenda.getQuantidade();
			this.total += item;
		}//FOR

			this.lbl_valor.setText(""+total);
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	ORGANIZA O FORMULÁRIO
		this.btn_novo.setEnabled(false);
		this.btn_cancelar.setEnabled(true);
		this.btn_anterior.setEnabled(true);
		this.btn_proximo.setEnabled(true);
		this.btn_primeiro.setEnabled(true);
		this.btn_ultimo.setEnabled(true);
		this.btn_alterar.setEnabled(true);
		//---------------------------------------------------------------------------

		rotina.Fechar(gerenciador);
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        
		gerenciador = rotina.Conectar();
                  venda = (Venda)rotina.Proximo(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);
				  
		//-------------------------------------------------------------------------
		//	REINICIA O FORMULÁRIO
		this.ReiniciaFormulario();
		//-------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------
		//	PREENCHENDO OS DADOS DA VENDA
		this.lbl_codigo.setText(""+venda.getId());
		this.lbl_data.setText(venda.getData());
		this.lbl_hora.setText(venda.getHora());
		this.lbl_vendedor.setText(venda.getUsuario().getNome());
		this.box_pagamanto.setSelectedItem(venda.getPagamento());
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	PREENCHENDA A TABELA COM OS ITENS
		for(int i = 0 ; i < venda.getProdutoVendaList().size() ; i ++){

			produtoVenda = venda.getProdutoVendaList().get(i);
			DefaultTableModel tbl_def = (DefaultTableModel)this.tbl_itens.getModel();
			tbl_def.addRow(new Object[] {produtoVenda.getProduto().getId(), produtoVenda.getProduto().getNome(), 
				produtoVenda.getProduto().getValorVenda(), produtoVenda.getQuantidade()});
			double item = produtoVenda.getProduto().getValorVenda()*produtoVenda.getQuantidade();
			this.total += item;
		}//FOR

			this.lbl_valor.setText(""+total);
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	ORGANIZA O FORMULÁRIO
		this.btn_novo.setEnabled(false);
		this.btn_cancelar.setEnabled(true);
		this.btn_anterior.setEnabled(true);
		this.btn_proximo.setEnabled(true);
		this.btn_primeiro.setEnabled(true);
		this.btn_ultimo.setEnabled(true);
		this.btn_alterar.setEnabled(true);
		//---------------------------------------------------------------------------

		rotina.Fechar(gerenciador);
		
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
        
		gerenciador = rotina.Conectar();
                  venda = (Venda)rotina.Primeiro(gerenciador, tabela);
				  
		//-------------------------------------------------------------------------
		//	REINICIA O FORMULÁRIO
		this.ReiniciaFormulario();
		//-------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------
		//	PREENCHENDO OS DADOS DA VENDA
		this.lbl_codigo.setText(""+venda.getId());
		this.lbl_data.setText(venda.getData());
		this.lbl_hora.setText(venda.getHora());
		this.lbl_vendedor.setText(venda.getUsuario().getNome());
		this.box_pagamanto.setSelectedItem(venda.getPagamento());
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	PREENCHENDA A TABELA COM OS ITENS
		for(int i = 0 ; i < venda.getProdutoVendaList().size() ; i ++){

			produtoVenda = venda.getProdutoVendaList().get(i);
			DefaultTableModel tbl_def = (DefaultTableModel)this.tbl_itens.getModel();
			tbl_def.addRow(new Object[] {produtoVenda.getProduto().getId(), produtoVenda.getProduto().getNome(), 
				produtoVenda.getProduto().getValorVenda(), produtoVenda.getQuantidade()});
			double item = produtoVenda.getProduto().getValorVenda()*produtoVenda.getQuantidade();
			this.total += item;
		}//FOR

			this.lbl_valor.setText(""+total);
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	ORGANIZA O FORMULÁRIO
		this.btn_novo.setEnabled(false);
		this.btn_cancelar.setEnabled(true);
		this.btn_anterior.setEnabled(true);
		this.btn_proximo.setEnabled(true);
		this.btn_primeiro.setEnabled(true);
		this.btn_ultimo.setEnabled(true);
		this.btn_alterar.setEnabled(true);
		//---------------------------------------------------------------------------

		rotina.Fechar(gerenciador);
		
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        
		gerenciador = rotina.Conectar();
                  venda = (Venda)rotina.Ultimo(gerenciador, tabela);
				  
		//-------------------------------------------------------------------------
		//	REINICIA O FORMULÁRIO
		this.ReiniciaFormulario();
		//-------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------
		//	PREENCHENDO OS DADOS DA VENDA
		this.lbl_codigo.setText(""+venda.getId());
		this.lbl_data.setText(venda.getData());
		this.lbl_hora.setText(venda.getHora());
		this.lbl_vendedor.setText(venda.getUsuario().getNome());
		this.box_pagamanto.setSelectedItem(venda.getPagamento());
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	PREENCHENDA A TABELA COM OS ITENS
		for(int i = 0 ; i < venda.getProdutoVendaList().size() ; i ++){

			produtoVenda = venda.getProdutoVendaList().get(i);
			DefaultTableModel tbl_def = (DefaultTableModel)this.tbl_itens.getModel();
			tbl_def.addRow(new Object[] {produtoVenda.getProduto().getId(), produtoVenda.getProduto().getNome(), 
				produtoVenda.getProduto().getValorVenda(), produtoVenda.getQuantidade()});
			double item = produtoVenda.getProduto().getValorVenda()*produtoVenda.getQuantidade();
			this.total += item;
		}//FOR

			this.lbl_valor.setText(""+total);
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//	ORGANIZA O FORMULÁRIO
		this.btn_novo.setEnabled(false);
		this.btn_cancelar.setEnabled(true);
		this.btn_anterior.setEnabled(true);
		this.btn_proximo.setEnabled(true);
		this.btn_primeiro.setEnabled(true);
		this.btn_ultimo.setEnabled(true);
		this.btn_alterar.setEnabled(true);
		//---------------------------------------------------------------------------

		rotina.Fechar(gerenciador);
		
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
		//---------------------------------------------------------------------
		//	PREPARA PARA REALIZAR A ALTERAÇÃO
		this.alterador = "altera";
		
		this.txt_busca_produto.setEnabled(true);
		this.txt_quantidade_produto.setEnabled(true);
		this.btn_adicionar.setEnabled(true);
		this.btn_remover.setEnabled(true);
		this.btn_finalizar.setEnabled(true);
		this.tbl_itens.setEnabled(true);
		//----------------------------------------------------------------------
			
    }//GEN-LAST:event_btn_alterarActionPerformed

//=========================================================================================
//	COMPONENTES DO JFRAME
//=========================================================================================
	    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_pagamanto;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_localizar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_busca_produto;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_cv;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_itens;
    private javax.swing.JLabel lbl_pagamento;
    private javax.swing.JLabel lbl_quantidade_produto;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_v;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JLabel lbl_vendedor;
    private javax.swing.JPanel pnl_acoes;
    private javax.swing.JPanel pnl_informacoes;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JPanel pnl_produto;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JTable tbl_itens;
    private javax.swing.JTextField txt_busca_produto;
    private javax.swing.JTextField txt_quantidade_produto;
    // End of variables declaration//GEN-END:variables

//=========================================================================================
//	MÉTODOS
//=========================================================================================
         
         public void ReiniciaFormulario(){
                  this.btn_alterar.setEnabled(false);
                  this.btn_anterior.setEnabled(false);
                  this.btn_cancelar.setEnabled(false);
                  this.btn_novo.setEnabled(true);
                  this.btn_primeiro.setEnabled(false);
                  this.btn_proximo.setEnabled(false);
                  this.btn_finalizar.setEnabled(false);
                  this.btn_ultimo.setEnabled(false);
                  this.btn_adicionar.setEnabled(false);
                  this.btn_remover.setEnabled(false);
                  
                  this.txt_busca_produto.setEnabled(false);
                  this.txt_quantidade_produto.setEnabled(false);
                  
                  this.box_pagamanto.setEnabled(false);
                  
                  this.tbl_itens.setEnabled(false);

                  this.btn_localizar.setEnabled(true);
                  this.lbl_codigo.setText("");
                  this.lbl_vendedor.setText("");
                  this.lbl_valor.setText("");
				  
		this.txt_busca_produto.setEnabled(false);
		this.txt_quantidade_produto.setEnabled(false);
		this.btn_adicionar.setEnabled(false);
		this.btn_remover.setEnabled(false);
		
		this.total = 0;
		this.lbl_valor.setText(""+total);
		this.lbl_codigo.setText("");
		this.lbl_vendedor.setText("");
		this.txt_busca_produto.setText("");
		this.txt_quantidade_produto.setText("");
		this.lbl_data.setText("");
		this.lbl_hora.setText("");
		
		for(int i = 0  ; this.tbl_itens.getModel().getRowCount() > 0 ; ++i ){
		
			((DefaultTableModel) this.tbl_itens.getModel()).removeRow(0);
		
		}//FOR
                  
         }//REINICIA FORMULÁRIO
		 
	public void CriaTabela(){
	
		this.tbl_itens.getColumnModel().getColumn(0).setPreferredWidth(10);
		this.tbl_itens.getColumnModel().getColumn(1).setPreferredWidth(100);
		this.tbl_itens.getColumnModel().getColumn(2).setPreferredWidth(10);
		this.tbl_itens.getColumnModel().getColumn(3).setPreferredWidth(10);
		
	}//CRIA A TABELA
         
}//CLASS
