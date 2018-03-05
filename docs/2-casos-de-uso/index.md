# Casos de uso

## 1. Diagrama de casos de uso

![Diagrama dos casos de uso](https://github.com/leofsl/ppads-projeto-05K/blob/master/docs/2-casos-de-uso/Diagrama%20Casos%20de%20Uso.PNG)

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

[FA05] – Verificar usuários da empresa
1. Sistema detecta que usuário é administrador.
2. Usuário clica na opção “Dashboard” do menu.
3. Sistema exibe na página duas listas, uma incluindo usuários para aprovação e outra dos usuários que pertencem à instituição.

#### 2.2.5 REQUISITOS ESPECIAIS
Não se aplica.

#### 2.2.6 PÓS-CONDIÇÕES
O sistema deve exibir, criar, alterar ou excluir de acordo com a escolha do usuário.

#### 2.2.7 PONTOS DE EXTENSÃO
Administradores poderão manter todos os posts.
