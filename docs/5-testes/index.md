# Plano de testes

**Nome do caso de uso:** Manter Usuário.

**Procedimento de teste:**

***Testes referentes ao cadastro de usuários:***
 
● 	TC01 - Todos os campos válidos
 
Descrição: Este caso de teste tem como objetivo cadastrar o usuário.
 
Pré-condições: O usuário não estar cadastrado, todos os campos são válidos e botão “CADASTRAR” acionado.
 
Pós-condições: Mensagem de cadastro efetuado com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Nome, e-mail, empresa associada, telefone e senha.

● 	TC02 - Todos os campos inválidos
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário quando todos os campos estão inválidos.
 
Pré-condições: O usuário não estar cadastrado, todos os campos são inválidos e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que os campos estão inválidos ou vazios e que o usuário não foi cadastrado.
 
Dados necessários: Nome, e-mail, empresa associada, telefone e senha.

● 	TC03 - Campo ‘nome’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'nome' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘nome’ estar vazio e botão “CADASTRAR” acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘nome’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.

● 	TC04 - Campo ‘e-mail’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'email' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘e-mail’ estar vazio e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘e-mail’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.

● 	TC05 - Campo ‘e-mail’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir o cadastro caso o campo 'e-mail’ esteja inválido.
 
Pré-condições: O usuário não estar cadastrado, campo ‘e-mail’ contendo caracteres inválidos e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘e-mail’ contém caracteres inválidos e que o usuário não foi cadastrado.
 
Dados necessários: E-mail.
 
● 	TC06 - Campo ‘confirmar e-mail’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'confirmar e-mail' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘confirmar e-mail’ estar vazio e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘confirmar e-mail’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.
 
● 	TC07 - Campo ‘confirmar e-mail’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir o cadastro caso o campo 'confirmar e-mail’ esteja inválido.
 
Pré-condições: O usuário não estar cadastrado, campo ‘confirmar e-mail’ contendo caracteres inválidos e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘e-mail’ contém caracteres inválidos e que o usuário não foi cadastrado.
 
Dados necessários: E-mail.
 
● 	TC08 - Campo ‘email’ e ‘confirmar email’ não correspondem
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso os dados dos campos 'email' e 'confirmar email' sejam diferentes.
 
Pré-condições: O usuário não estar cadastrado, campo ‘email’ e ‘confirmar email’ não correspondendo e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que os e-mails não correspondem e que o usuário não foi cadastrado.
 
Dados necessários: E-mail.
 
● 	TC09 - Campo ‘empresa associada’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'empresa associada' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘empresa associada’ estar vazio e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘empresa associada’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.

● 	TC10 - Campo ‘empresa associada’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir o cadastro caso o campo 'empresa associada' esteja inválido.
 
Pré-condições: O usuário não estar cadastrado, campo ‘empresa associada’ contendo caracteres inválidos e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘empresa associada’ contém caracteres inválidos e que o usuário não foi cadastrado.
 
● 	TC11 - Campo ‘telefone’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'telefone' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘telefone’ estar vazio e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘telefone’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.
 
● 	TC12 - Campo ‘telefone’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir o cadastro caso o campo 'telefone' esteja inválido.
 
Pré-condições: O usuário não estar cadastrado, campo ‘telefone’ contendo caracteres inválidos e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘telefone’ contém caracteres inválidos e que o usuário não foi cadastrado.
 
Dados necessários: Telefone.
 
● 	TC13 - Campo ‘senha’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'senha' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘senha’ estar vazio e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘senha’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.
 
● 	TC14 - Campo ‘confirmar senha’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso o campo 'confirmar senha' esteja vazio.
 
Pré-condições: O usuário não estar cadastrado, campo ‘confirmar senha’ estar vazio e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘confirmar senha’ está vazio e que o usuário não foi cadastrado.
 
Dados necessários: Não há.
 
● 	TC15 - Campo ‘senha’ e ‘confirmar senha’ não correspondem
 
Descrição: Este caso de teste tem como objetivo impedir o cadastro do usuário caso os dados dos campos 'senha' e 'confirmar senha' sejam diferentes.
 
Pré-condições: O usuário não está cadastrado, campo ‘senha’ e ‘confirmar senha’ não correspondem e botão “CADASTRAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que as senhas não correspondem e que o usuário não foi cadastrado.
 
Dados necessários: Senha, confirmação de senha.

***Testes referentes à edição de um usuário:***

●     TC16 - Alterar nome
 
Descrição: Este caso de teste tem como objetivo alterar o nome do usuário cadastrado no sistema.
 
Pré-condição: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, informado o novo nome e em seguida acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração do nome efetuada com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Nome.
 
●     TC17 - Campo ‘nome’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o usuário não possua um nome vazio.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado seu cadastro com o campo ‘nome’ em branco e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘nome’ deve ser preenchido.
 
Dados necessários: Não há.
 
●     TC18 - Alterar e-mail
 
Descrição: Este caso de teste tem como objetivo alterar o email do usuário cadastrado no sistema.
 
Pré-condição: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, informado o novo email e em seguida acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração de email efetuada com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Email.

●     TC19 - Campo ‘e-mail’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir a alteração caso o campo 'email’ esteja inválido.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado seu cadastro com caracteres inválidos no campo ‘e-mail’ e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘email’ contém caracteres inválidos e deve ser preenchido corretamente.
 
Dados necessários: E-mail.
 
●     TC20 - Campo ‘e-mail’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o usuário não possua um e-mail vazio.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado seu cadastro com o campo ‘e-mail’ em branco e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘e-mail’ deve ser preenchido.
 
Dados necessários: Não há.
 
●     TC21 - Alterar telefone
 
Descrição: Este caso de teste tem como objetivo alterar o telefone do usuário cadastrado no sistema.
 
Pré-condição: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, informado o novo número de telefone e em seguida acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração do telefone efetuada com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Telefone.
 
●     TC22 - Campo ‘telefone’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir o cadastro caso o campo 'telefone' esteja inválido.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado seu cadastro com caracteres inválidos no campo ‘telefone’ e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘telefone’ contém caracteres inválidos e deve ser preenchido corretamente.
 
Dados necessários: Telefone.
 
●     TC23 - Campo ‘telefone’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o usuário não possua um telefone vazio.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado seu cadastro com o campo ‘telefone’ em branco e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘telefone’ deve ser preenchido.
 
Dados necessários: Não há.
 
●     TC24 - Alterar senha
 
Descrição: Este caso de teste tem como objetivo alterar a senha do usuário cadastrado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, informando a senha atual corretamente, a nova senha com sua confirmação e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de alteração de senha efetuada com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Senha atual, nova senha e confirmação da nova senha.
 
●     TC25 - Senha atual incorreta
 
Descrição: Este caso de teste tem como objetivo impedir a alteração da senha do usuário cadastrado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado sua senha informando a senha atual incorretamente e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que a senha atual foi digitada incorretamente.
 
Dados necessários: Senha.
 
●     TC26 - Confirmação de nova senha incompatível com a nova senha
 
Descrição: Este caso de teste tem como objetivo impedir a alteração da senha do usuário cadastrado no sistema, quando a nova senha e sua confirmação não são iguais.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados”, alterado sua senha informando a senha atual, informando dados diferentes nos campos de 'nova senha' e 'confirmar senha' e em seguida acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que as senhas não conferem.
 
Dados necessários: Nova senha, confirmação de nova senha.
 
●     TC27 - Campo ‘senha’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o usuário não possua uma senha vazia.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados” e atualizado seu cadastro com o campo ‘senha’ e ‘confirmação de nova senha’ em branco.
 
Pós-condições: Mensagem de erro informando que o campo ‘senha’ e ‘confirmação de nova senha’ devem ser preenchidos.
 
Dados necessários: Não há.

***Testes referentes à exclusão de usuário:***

●     TC28 - Usuário deseja excluir sua conta
 
Descrição: Este caso de teste tem como objetivo excluir a conta do usuário cadastrada no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados” e selecionado o botão “Excluir Conta”.
 
Pós-condições: Mensagem informando que a conta foi excluída com sucesso.
 
Dados necessários: Não há.
 
●     TC29 - Usuário confirmou a exclusão de sua conta
 
Descrição: Este caso de teste tem como objetivo confirmar a exclusão da conta usuário cadastrada no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados” e selecionado o botão “Excluir Conta” e confirmado a exclusão.
 
Pós-condições: Mensagem informando que a conta foi excluida com sucesso.
 
Dados necessários: Não há.
 
●     TC30 - Usuário não confirmou a exclusão de sua conta
 
Descrição: Este caso de teste tem como objetivo impedir a exclusão da conta caso o usuário não confirme a exclusão.
 
Pré-condições: O usuário deve estar logado no sistema, na página do ‘perfil’, acionado o botão “Alterar Dados” e selecionado o botão “Excluir Conta” e não confirmado a exclusão.
 
Pós-condições: O usuário ainda consta no banco de dados.
 
Dados necessários: Não há.

***

**Nome do caso de uso:** Manter Post.

**Procedimento de teste:**

***Testes referentes à criação de post:***
 
● 	TC01 - Todos os campos válidos
 
Descrição: Este caso de teste tem como objetivo criar um post.
 
Pré-condições: O usuário deve estar logado no sistema, acionado o botão “Criar Post”, todos os campos são válidos e botão “Excluir Conta” for acionado.
 
Pós-condições: Mensagem de post efetuado com sucesso e post armazenado no banco de dados.
 
Dados necessários: Assunto, local, descrição e categoria.
 
● 	TC02 - Todos os campos inválidos
 
Descrição: Este caso de teste tem como objetivo impedir a criação do post quando todos os campos estão inválidos.
 
Pré-condições: O usuário deve estar logado no sistema, acionado o botão “Criar Post”, todos os campos são inválidos e botão “SALVAR” for acionado.
 
Pós-condições: Mensagens de erro informando que os campos estão vazios e que o post não foi criado.
 
Dados necessários: Assunto, local, descrição e categoria.
 
● 	TC03 - Campo ‘assunto’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir a criação do post quando o campo 'assunto' esteja vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado o botão “Criar Post”, campo ‘assunto’ estar vazio e botão “SALVAR” for acionado.
 
Pós-condições: Mensagens de erro informando que o campo ‘assunto’ está vazio e que o post não foi criado.
 
Dados necessários: Não há.
 
● 	TC04 - Campo ‘local’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir a criação do post quando o campo 'local' esteja vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado o botão “Criar Post”, campo ‘local’ estar vazio e botão “SALVAR” for acionado.
 
Pós-condições: Mensagens de erro informando que o campo ‘local’ está vazio e que o post não foi criado.
 
Dados necessários: Não há.
 
● 	TC05 - Campo ‘categoria’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir a criação do post quando o campo 'categoria' esteja vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado o botão “Criar Post”, campo ‘categoria’ não selecionado e botão “SALVAR” for acionado.
 
Pós-condições: Mensagens de erro informando que o campo ‘categoria’ está vazio e que o post não foi criado.
 
Dados necessários: Não há. 

● 	TC06 - Campo ‘descrição’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir a criação do post quando o campo 'descrição' esteja vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado o botão “Criar Post”, campo ‘descrição’ estar vazio e botão “SALVAR” for acionado.
 
Pós-condições: Mensagens de erro informando que o campo ‘descrição’ está vazio e que o post não foi criado.
 
Dados necessários: Não há.

***Testes referentes à edição de um post:***

●     TC07 - Alterar assunto
 
Descrição: Este caso de teste tem como objetivo alterar o assunto do post criado no sistema.
 
Pré-condição:  O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, alterado o campo ‘assunto’ e acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração do ‘assunto’ efetuado com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Assunto.
 
●     TC08 - Campo ‘assunto’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o post não possua o campo ‘assunto’ vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, campo ‘assunto’ vazio e acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘assunto’ deve ser preenchido.
 
Dados necessários: Não há.
 
●     TC09 - Alterar local
 
Descrição: Este caso de teste tem como objetivo alterar o local do post criado no sistema.
 
Pré-condição:  O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, alterado o campo ‘local’ e acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração do ‘local’ efetuado com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Local.
 
●     TC10 - Campo ‘local’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o post não possua o campo ‘local’ vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, campo ‘local’ vazio e acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘local’ deve ser preenchido.
 
Dados necessários: Não há.
 
●     TC11 - Alterar descrição
 
Descrição: Este caso de teste tem como objetivo alterar a descrição do post criado no sistema.
 
Pré-condição:  O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, alterado o campo ‘descrição’ e acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração da ‘descrição’ efetuada com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Descrição.
 
●     TC12 - Campo ‘descrição’ vazio
 
Descrição: Este caso de teste tem como objetivo garantir que o post não possua o campo ‘descrição’ vazio.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, campo ‘descrição’ vazio e acionado o botão “SALVAR”.
 
Pós-condições: Mensagem de erro informando que o campo ‘descrição’ deve ser preenchido.
 
Dados necessários: Não há.
 
●     TC13 - Alterar foto
 
Descrição: Este caso de teste tem como objetivo alterar a foto do post criado no sistema.
 
Pré-condição: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, ter acionado o botão “Escolher Arquivo”, selecionado uma foto e acionado o botão “SALVAR”.
 
Pós-condição: Mensagem de alteração da ‘foto’ efetuada com sucesso e as informações armazenadas no banco de dados.
 
Dados necessários: Foto.

***Testes referentes à exclusão de post:***

●     TC14- Usuário deseja excluir seu post
 
Descrição: Este caso de teste tem como objetivo excluir um post do usuário cadastrado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado e ter acionado o botão ‘lixeira’.
 
Pós-condições: Mensagem informando que o post foi excluído com sucesso.
 
Dados necessários: Não há.
 
●     TC15 - Usuário confirmou a exclusão do seu post
 
Descrição: Este caso de teste tem como objetivo confirmar a exclusão de um post do usuário criado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, acionado o botão ‘lixeira’ e confirmado a exclusão.
 
Pós-condições: Mensagem informando que o post foi excluído com sucesso.
 
Dados necessários: Não há.
 
●     TC16 - Usuário não confirmou a exclusão de seu post
 
Descrição: Este caso de teste tem como objetivo impedir a exclusão de um post caso o usuário não confirme a exclusão.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, acionado o botão ‘lixeira’ e não confirmado a exclusão.
 
Pós-condições: O post ainda consta no banco de dados.
 
Dados necessários: Não há.

***Testes referentes a pesquisa de post:***

● 	TC17 - Buscar post
 
Descrição: Este caso de teste tem como objetivo pesquisar posts.
 
Pré-condições: O usuário deve estar logado no sistema, a página ‘dashboard’ deve estar selecionada, post desejado deve estar selecionado.
 
Pós-condições: Uma lista de posts é gerada para a visualização e edição (caso o post pertença ao usuário).
 
Dados necessários: Assunto.

***

**Nome do caso de uso:** Avaliar Post.

**Procedimento de teste:**

***Testes referentes a avaliação de post:***

●     TC01 - Usuário avalia post
 
Descrição: Este caso de teste tem como objetivo avaliar um post criado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, buscado e selecionado o post a ser avaliado e acionado o botão “Like”.
 
Pós-condições: Mensagem de sucesso informando que houve um “Like” no post.
 
Dados necessários: Não há.

***

**Nome do caso de uso:** Modificar Privilégios de Acesso.

**Procedimento de teste:**

***Testes referentes a modificação do privilégio de acesso:***

●	TC01 - Usuário modifica privilégio
 
Descrição: Este caso de teste tem como objetivo modificar privilégios de acesso dos usuários cadastrados no sistema.
 
Pré-condições: O usuário administrador deve estar cadastrado no sistema, acionado a página “Dashboard”, selecionado um usuário, acionado o botão “cadeado”, modificado os privilégios e o botão “SALVAR” acionado.
 
Pós-condições: Mensagem informando que o privilégio foi alterado com sucesso.
 
Dados necessários: Usuário.

***

**Nome do caso de uso:** Gerar Relatório de Atendimento.

**Procedimento de teste:**

***Testes referentes a geração de relatórios:***

●	TC01 - Gerar relatório
 
Descrição: Este caso de teste tem como objetivo gerar relatório administrativo para tomadas de decisão.
 
Pré-condições: O usuário administrador deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o filtro e acionado a página “analytics”.
 
Pós-condições: O sistema deve exibe dois gráficos com quantidade de posts por status e categoria.
 
Dados necessários: Post.

***

**Nome do caso de uso:** Comentar.

**Procedimento de teste:**

***Testes referentes a comentário:***

●	TC01 - Fazer comentário
 
Descrição: Este caso de teste tem como objetivo criar comentário em um post já existente.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post a ser comentado, digitado o comentário e botão “COMENTAR” acionado.
 
Pós-condições: Mensagem informando que o comentário foi realizado com sucesso, informações armazenadas no banco de dados e o sistema o exibe no post.
 
Dados necessários: Comentário.

***

**Nome do caso de uso:** Excluir Comentário.

**Procedimento de teste:**

***Testes referentes a exclusão de comentário:***

●     TC01- Usuário deseja excluir seu comentário
 
Descrição: Este caso de teste tem como objetivo excluir um comentário de um post criado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado e acionado o botão “lixeira” do comentário feito.
 
Pós-condições: Mensagem informando que o comentário foi excluído com sucesso.
 
Dados necessários: Não há.
 
●     TC02 - Usuário confirmou a exclusão do seu comentário
 
Descrição: Este caso de teste tem como objetivo confirmar a exclusão do comentário de um post criado no sistema.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, acionado o botão “lixeira” do comentário feito e confirmado a exclusão.
 
Pós-condições: Mensagem informando que o comentário foi excluído com sucesso.
 
Dados necessários: Não há.
 
●     TC03 - Usuário não confirmou a exclusão de seu post
 
Descrição: Este caso de teste tem como objetivo impedir a exclusão do comentário de um post criado no sistema, caso o usuário não confirme a exclusão.
 
Pré-condições: O usuário deve estar logado no sistema, acionado a página ‘dashboard’, selecionado o post desejado, acionado o botão ‘lixeira’ do comentário feito e não confirmado a exclusão.
 
Pós-condições: O comentário ainda consta no post e banco de dados.
 
Dados necessários: Não há.

***

**Nome do caso de uso:** Entrar em Contato.

**Procedimento de teste:**

***Testes referentes entrar em contato:***

●	TC01 - Entrar em contato
 
Descrição: Este caso de teste tem como objetivo enviar uma mensagem do usuário para os administradores do sistema.
 
Pré-condições: O usuário deve ter acionado a página ‘contato’, preenchido os campos necessários e acionado o botão “ENVIAR”.

Pós-condições: Mensagem informando que a mensagem de envio com sucesso e uma mensagem é encaminhada para o administrador.
 
Dados necessários: Mensagem.

● 	TC02 - Campo ‘e-mail’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o envio da mensagem do usuário para os administradores do sistema caso o campo 'email' esteja vazio.
 
Pré-condições: O usuário deve ter acionado a página ‘contato’, campo ‘e-mail’ estar vazio e botão “ENVIAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘e-mail’ está vazio e que a mensagem não foi enviada.
 
Dados necessários: Não há.
 
● 	TC03 - Campo ‘e-mail’ inválido
 
Descrição: Este caso de teste tem como objetivo possuir uma máscara a fim de evitar erros do usuário e impedir o envio da mensagem caso o campo 'e-mail’ esteja inválido.
 
Pré-condições:  O usuário deve ter acionado a página ‘contato’, campo ‘e-mail’ contendo caracteres inválidos e botão “ENVIAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘e-mail’ contém caracteres inválidos e que a mensagem não foi enviada.
 
Dados necessários: E-mail.

● 	TC04 - Campo ‘mensagem’ vazio
 
Descrição: Este caso de teste tem como objetivo impedir o envio da mensagem do usuário para os administradores do sistema caso o campo 'mensagem' esteja vazio.
 
Pré-condições: O usuário deve ter acionado a página ‘contato’, campo ‘mensagem’ estar vazio e botão “ENVIAR” foi acionado.
 
Pós-condições: Mensagem de erro informando que o campo ‘mensagem’ está vazio e que a mensagem não foi enviada.
 
Dados necessários: Não há.
