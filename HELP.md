# Getting Started

Fluxo de persistencia/busca de dados:

    - Na controller: receber os dados brutos no endpoint em um dto quando necessário, usar o Validation para tratar
        valores nulos ou inválidos.
    
    - Passar o dto para a service do dominio e converter em um objeto de domínio, usando mappers, para 
        fazer as validações de dados.
    
    - Na service: chamar o usecase desse dominio e aplicar as regras de negócio, caso seja necessário buscar mais dados externos
       que estejam na base ou em outra api, deverá ser buscado aqui no service e passar para o usecase.
        * o usecase deverá receber os dados prontos para validar a regra e não deverá acessar base de dados ou api 
            diretamente, esses dados devem vir da service.
    
    Quando for necessário salvar os dados ou fazer uma busca: 
    - Após a validação dos dados e regras de negócio, devolver para a service e ela irá converter a entidade de domínio
        para entidade de persistência, chamar o repository para salvar ou buscar os dados na base.

    Devolvendo dados para o usuário:
    - Na service, converter a entidade de dominio para dto e devolver para a controller, a assim devolver para o usuario
     apenas os dados necessários.
    
    