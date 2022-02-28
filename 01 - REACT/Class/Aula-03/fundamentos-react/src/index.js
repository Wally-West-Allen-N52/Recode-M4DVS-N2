import './index.css'
import reactDom from 'react-dom'
import react from 'react'

// componente JSX primeiro
import Primeiro from './componentes/basico/Primeiro'
// componente JSX com parametro
import ComParametro from './componentes/basico/ComParametro'
// componente JSX primeiro
reactDom.render(
    <div>
        <Primeiro></Primeiro>
        {/*inserir parametros na tag de abertura*/}
        <ComParametro
        titulo = "Segundo Componente"
        subtitulo = "Implementando parâmetros">

        </ComParametro> 
    </div>,
    document.getElementById('root')
)
// componente JSX primeiro