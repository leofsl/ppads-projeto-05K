# Casos de uso

## 1. Diagrama de casos de uso

![Diagrama dos casos de uso](Diagrama%20Casos%20de%20Uso.jpg)

## 2. Especificação dos casos de uso

### 2.1. Caso de uso: **MANTER POST**

#### 2.1.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo manter os posts criados no sistema.

#### 2.1.2 ATORES
Usuário e Administrador.

#### 2.1.3 PRÉ-CONDIÇÕES
Os atores devem estar cadastrados no sistema.

#### 2.1.4 FLUXO DE EVENTOS

##### 2.1.4.1	FLUXO PRINCIPAL

 [FP01] – Criar Post
1. O Ator seleciona o dashboard
2. O ator seleciona a opção “Criar Post”.
3. O sistema disponibiliza tela para o ator informar os dados.
4. O ator informa os dados de entrada.
5. O ator confirma a criação do post selecionando a opção “Salvar”.
6. O sistema exibe abaixo da opção “Salvar” um botão para escolher uma imagem para o post.
7. O ator seleciona uma imagem e clica em “Adicionar imagem”. [FA06]
8. O sistema valida os dados informados. [FA04]
9. O sistema exibe mensagem de sucesso.

##### 2.1.4.2	FLUXOS ALTERNATIVOS

 [FA01] – Pesquisar Post
1. O ator pesquisa o post pela tabela “meus posts” em Dashboards.
2. O ator seleciona um post da lista.
3. O sistema redireciona o ator para a página do post selecionado.

[FA02] – Alterar Post
1. O ator vai na página de dashboard e busca todos os posts. [FA05] 
2. O ator seleciona um post.
3. O sistema redireciona para a página do post liberando os campos para alteração.
4. O sistema valida os dados informados. [FA04]
5. O sistema exibe mensagem de sucesso.
6. O caso de uso retorna ao passo 3 do fluxo principal.

[FA03] – Excluir Post
1. O ator vai na página de dashboard e busca todos os posts. [FA05] 
2. O ator seleciona post a ser excluído
3. O sistema abre o post selecionado
4. O ator seleciona a opção “Excluir” do post.
5. O sistema pede confirmação ao ator para exclusão.
6. O sistema exclui o post do sistema. 
7. O sistema exibe mensagem de sucesso.
8. O caso de uso retorna ao passo 3 do fluxo principal.

[FA04] – Dados Inválidos
1. O sistema informa que os dados informados estão incorretos.
2. O caso de uso retorna 4 passos ao passo que chamou este fluxo.

[FA05] – Usuário não deseja incluir imagem.
1. O usuário seleciona o botão “Não irei adicionar imagem”.
2. O sistema redireciona o usuário para a página do post.

#### 2.1.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.1.6 PÓS-CONDIÇÕES
O sistema deve exibir, criar, alterar ou excluir de acordo com a escolha do usuário.

#### 2.1.7 PONTOS DE EXTENSÃO
Administradores poderão manter todos os posts.

***

### 2.1. Caso de uso: **MANTER USUÁRIO**

#### 2.2.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo manter os usuários cadastrados no sistema.

#### 2.2.2 ATORES
Usuário e Administrador.

#### 2.2.3 PRÉ-CONDIÇÕES
Os atores devem estar cadastrados no sistema (Exceto para criar usuário).

#### 2.2.4 FLUXO DE EVENTOS

##### 2.2.4.1 FLUXO PRINCIPAL

 [FP01] – Criar Usuário
1. O ator seleciona a opção “Cadastrar”.
2. O sistema disponibiliza tela para o ator informar os dados.
3. O ator informa os dados de entrada.
4. O ator confirma a criação do usuário selecionando a opção “Cadastrar”.
5. O sistema valida os dados informados. [FA04]
6. O sistema exibe mensagem solicitando que o usuário aguarde confirmação do administrador.

##### 2.2.4.2 FLUXOS ALTERNATIVOS

 [FA01] – Consultar
1. O sistema verifica se é um usuário comum ou um administrador.
2. O sistema o ator seleciona a opção “perfil” e o sistema retorna as informações daquele usuário, somente.
3. O sistema redireciona para a página com as informações da consulta. [FA06]

[FA02] – Alterar Usuário
1. O sistema verifica se é um usuário comum ou um administrador.
2. O usuário clica na opção “Perfil” do menu.
3. O sistema redireciona para a página com as informações do usuário liberando os campos para alteração.
4. O sistema pede confirmação ao ator para atualização.
5. O sistema valida os dados informados. [FA04]
6. O sistema exibe mensagem de sucesso.
7. O sistema notifica o usuário da alteração na conta através de um e-mail.
8. O caso de uso retorna ao passo 3 do fluxo principal.

[FA03] – Excluir Usuário
1. O ator clica em “perfil”.
2. O sistema exibe perfil do usuário.
3. O ator clica em “excluir conta”.
4. O ator confirma a exclusão de conta.

[FA04] – Dados Inválidos
1. O sistema informa que os dados informados estão incorretos.
2. O caso de uso retorna 4 passos ao passo que chamou este fluxo.

[FA05] – Aprovar Usuário
1. Usuário administrador seleciona a opção dashboard.
2. Administrador escolhe usuário a ser aprovado.
3. Sistema envia e-mail de confirmação de aprovação para usuário.

[FA06] – Verificar usuários da empresa
1. Sistema detecta que usuário é administrador.
2. Usuário clica na opção “Dashboard” do menu.
3. Sistema exibe na página duas listas, uma incluindo usuários para aprovação e outra dos usuários que pertencem à instituição.

#### 2.2.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.2.6 PÓS-CONDIÇÕES
O sistema deve exibir, criar, alterar ou excluir de acordo com a escolha do usuário.

#### 2.2.7 PONTOS DE EXTENSÃO
Administradores poderão manter todos os posts.

***

### 2.3. Caso de uso: **AVALIAR POST**

#### 2.3.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo avaliar o post criados no sistema.

#### 2.3.2 ATORES
Administração.

#### 2.3.3 PRÉ-CONDIÇÕES
Os atores devem estar cadastrados no sistema.

#### 2.3.4 FLUXO DE EVENTOS

##### 2.3.4.1 FLUXO PRINCIPAL

[FP01] – Avaliar Post
1.	O ator seleciona a opção “Dashboard”. (Caso não esteja logado seleciona a opção “Posts” no menu)
2.	O sistema disponibiliza tela com lista dos posts criados.
3.	O ator seleciona o post desejado.
4.	O sistema disponibiliza tela com as informações e um botão de “Like”.
5.	O ator seleciona o botão de “Like”.
6.	O sistema exibe mensagem de sucesso.

##### 2.3.4.2 FLUXOS ALTERNATIVOS
Não se aplica.

##### 2.3.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.3.6 PÓS-CONDIÇÕES
A quantidade de likes do post deve ser aumentada.

#### 2.3.7 PONTOS DE EXTENSÃO
Não se aplica.

***

### 2.4. Caso de uso: **GERAR RELATÓRIOS**

#### 2.4.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo gerar os relatórios dos posts criados no sistema.

#### 2.4.2 ATORES
Administrador.

#### 2.4.3 PRÉ-CONDIÇÕES
Os posts devem estar cadastrados no sistema.

#### 2.4.4 FLUXO DE EVENTOS

##### 2.4.4.1 FLUXO PRINCIPAL

[FP01] – Gerar Relatório
1.	O ator seleciona a opção “Dashboard”.
2.	O sistema disponibiliza tela com lista dos posts criados.
3.	O ator seleciona o filtro para pesquisa. [FA01]
4.	O ator seleciona a opção “filtrar”.
5.	O sistema disponibiliza lista de posts.
6.	O Ator clica em “analytics”. [FA02]

##### 2.4.4.1 FLUXOS ALTERNATIVOS
	
[FA01] Gerar lista com filtros
1.	Sistema exibe lista filtros.
2.	O ator seleciona o filtro desejado.

[FA02] Gerar gráficos
1.	O sistema exibe dois gráficos, um com quantidade de posts por status e outro por categoria.

#### 2.4.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.4.6 PÓS-CONDIÇÕES
Relatório solicitado pelo usuário deves ser gerado de acordo com as preferências solicitadas.

#### 2.4.7 PONTOS DE EXTENSÃO
Administradores poderão manter todos os posts.

***

### 2.5. Caso de uso: **MODIFICAR PRIVILÉGIO DE ACESSO**

#### 2.5.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo modificar os privilégios de acesso dos usuários do sistema.

#### 2.5.2 ATORES
Administração.

#### 2.5.3 PRÉ-CONDIÇÕES
1. Os atores devem estar logados no sistema.
2. Os atores devem estar cadastrados no sistema, assim como o usuário que terá seu privilégio de acesso modificado.

#### 2.5.4 FLUXO DE EVENTOS

##### 2.5.4.1 FLUXO PRINCIPAL

[FP01] – Modificar privilégio
1. Usuário administrador clica em “dashboard”.
2. Sistema exibe lista de usuários.
3. O ator seleciona usuário a ter a permissão alterada.
4. Sistema disponibiliza dois tipos de acesso para serem selecionados.
5. O ator seleciona o tipo de permissão a ser atribuído.
6. Sistema faz a alteração.
7. O sistema envia e-mail para notificando alteração para o usuário.

##### 2.5.4.2 FLUXOS ALTERNATIVOS
Não se aplica.

#### 2.5.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.5.6 PÓS-CONDIÇÕES
Usuário deve ter privilégios de acesso alterados.

#### 2.5.7 PONTOS DE EXTENSÃO
Não se aplica.

***

### 2.6. Caso de uso: **COMENTAR**

#### 2.6.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo comentar os posts feitos por usuários.

#### 2.6.2 ATORES
Usuário comum ou Administrador.

#### 2.6.3 PRÉ-CONDIÇÕES
Usuários estarem logados no sistema.

#### 2.6.4 FLUXO DE EVENTOS

##### 2.6.4.1 FLUXO PRINCIPAL

[FP01] - Fazer comentário
1. O ator clica em “dashboard”.
2. O Sistema exibe lista de posts.
3. O ator seleciona o post.
4. O sistema exibe informações detalhadas do post.
5. O ator digita comentário.
6. O ator clica em “comentar”.
7. O sistema envia um e-mail ao usuário do post dizendo que houve um comentário.
8. O sistema atualiza o post incluindo o comentário.
9. O sistema redireciona para a página do post já atualizada.

##### 2.6.4.2 FLUXOS ALTERNATIVOS
Não se aplica.

#### 2.6.5 REQUISITOS ESPECIAIS
O comentário deve ser incluído no post.

#### 2.6.6 PÓS-CONDIÇÕES
Comentário deve ser salvo com sucesso.

#### 2.6.7 PONTOS DE EXTENSÃO
Não se aplica.

***

### 2.7. Caso de uso: **EXCLUIR COMENTÁRIO**

#### 2.7.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo excluir comentários dos posts feitos por usuários.

#### 2.7.2 ATORES
Usuário comum.

#### 2.7.3 PRÉ-CONDIÇÕES
Usuários estarem logados no sistema.

#### 2.7.4 FLUXO DE EVENTOS

##### 2.7.4.1 FLUXO PRINCIPAL

[FP01] - Excluir comentário
1. O ator clica em “dashboard”.
2. O Sistema exibe lista de posts.
3. O ator seleciona o post.
4. O sistema exibe informações detalhadas do post.
5. O ator clica no símbolo da lixeira para excluir comentário.

##### 2.7.4.2 FLUXOS ALTERNATIVOS
Não se aplica.

#### 2.7.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.7.6 PÓS-CONDIÇÕES
Comentário deve ser excluído com sucesso.

#### 2.7.7 PONTOS DE EXTENSÃO
Não se aplica.

***

### 2.8. Caso de uso: **ENTRAR EM CONTATO**

#### 2.8.1 BREVE DESCRIÇÃO
Este caso de uso tem como objetivo enviar uma mensagem do usuário para os administradores do sistema .

#### 2.8.2 ATORES
Usuário comum.

#### 2.8.3 PRÉ-CONDIÇÕES
Não se aplica.

#### 2.8.4 FLUXO DE EVENTOS

##### 2.8.4.1 FLUXO PRINCIPAL

[FP01] - Excluir comentário
1. Ator clica em “contato”.
2. O Sistema traz tela de contato.
3. O Ator preenche o formulário com os dados.
4. O ator clica em “enviar”.
5. O Sistema notifica o usuário que a mensagem foi enviada.
6. O sistema envia uma mensagem para o e-mail do BetterUni.

##### 2.8.4.2 FLUXOS ALTERNATIVOS
Não se aplica.

#### 2.8.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.8.6 PÓS-CONDIÇÕES
Mensagem escrita pelo usuário deve ser enviada com sucesso pela administração do BetterUni.

#### 2.8.7 PONTOS DE EXTENSÃO
Não se aplica.
