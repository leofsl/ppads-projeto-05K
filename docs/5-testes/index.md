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
