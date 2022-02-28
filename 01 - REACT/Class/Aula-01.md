# AULA 01 CONCEITOS DE REACT JSX

## CRIAR PROJETO
## "npx create-next-app exercicio"
## Criar arquivo js dentro dO PROJETO
## "/pages/01primeiro.js"
# EXPORTAR O CONTEÚDO DIRETO
## "export default function nome-func(){ return "Olá, Mundo!"}"

# PARA RODAR O NEXT APP
## npm run dev
## Após abrir no browser:
## "localhost:3000/primeiro.js"

# MESCLAR JS COM HTML
## Retira as áspas do contreúdo a ser renderizado e add as tags html puras

# HTML PODE SER ARMAZENADO EM UMA CONST
## 02jsxConst.js

## No novo arquivo:
## exprot default function jsx() {const conteudo = (<div><h1>Olá, Novo Mundo!</h1></div>) return conteudo}

## O código anterior já é um componente React

# PARA MODIFICAR A IDENTIFICAÇÃO DE LEITURA DA LINGUAGEM: de js para jsReact, no rodape

## 03troca-de-linguagem.js
## No novo arquivo:

# INTEGRAÇÃO JS COM HTML
## export default function retornoimbutido() {const subtitulo = "Tamo aí no JS!!" return (<div><h1>Integração </h1></div>)}

# FIRACODE
## Permite que alguns simblolos sejam mais legivel/"ligatures"

# ===================================================================
# AULA 02 CONCEITOS DE REACT

# CRIAR NOVO PROJETO REACT APP

## npx create-react-app conceitos-react
## "public/index.html";
### contem todos os links para renderizar o projeto

# FAZER O IMPORT DO REACT DOM
## import reactDOM from "react-dom";
### importa para o 'root' no ararquivo index.html

# CRIAR SAUDAÇÃO
## const saudacao = document.getElementById('root')
### reactDOM.render("Hello, World!!", saudacao)

# FAZER O IMPORT DO REACT PURO
## import React from 'react';
# CRAIR NOVA SAUDAÇÃO
## reactDOM.render(<div><strong>Hello, Real World!!!</strong></div>,document.getElementById('root'))

# APLICANDO CSS
# CRIAR UM ARQUIVO CSS
## index.css
# CRIAR ALGUMA MODIFICAÇÃO
## body {background-color: black; color: white;}
# IMPORTAR PARA O ROOT DO HTML
## import '.indexteste.css'

# CRIAR O PRIMEIRO COMPONENTE
# USAR O EXPORT PARA O COMPONENTE
## No primeiro componente.js:
## export default function Primeiro() {return 'Primeito componente'}
# REFERENCIAR COMOPONENTE NO index.js
## import Primeiro from './componentes/basico/Primeiro' 'com o sem a extensão JS'
# CRIAR COMPONENTE COM A TAG DE CHAMADA NO index.js
## reactDOM.render(return <div>'Primeiro componente'</div>, document.getElementById('root'))

# PODEMOS USAR OS COMPONENTES COM JSX
## Importar componente para index:
### import React from  "react"
# IMPLEMENTAR JSX NA FUNCTION PRIMEIRO()
## export default function Primeiro() {const msg = 'Cola na Minha!! return (<div><h2>Primeiro Componente<p></p>{msg}</h2></div>)}

# =========================================================================================
# AULA 03 CONCEITOS DE REACT

## CRIAR PROJETO
### "npx create-next-app fundamentos-react"

## Apagar todos os arquivos da pasta "src"
## Criar novos index JS e CSS:

### "/src/index.js"
### "/src/index.css"

## Criar nova pasta para componentes:
## Criar pasta componentes/nasico
## Criar componentes JSX:
### Primeiro.jsx
### ComParametro.jsx
### Recriar o compnente "Primeiro"
### Criar o compnente "ComParametro"

## Referenciar os componentes (com reactDom.render)
### atribuir os parâmetros(titulo e subtitulo) vindos do componente "ComParametro.jsx)" dentro da tag no render do index.js
### Não se esquecer de colocar "document.getElementById('root')" após tag </div> no reactDom.render

### Atribuir "params" nos parenteses da "function ComParametro(params)"