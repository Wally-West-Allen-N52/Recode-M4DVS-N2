import reactDOM from "react-dom";
import React from "react";
import './indextest.css';
import Primeiro from './componentes/basico/Primeiro'; 

// COM O USO DO IMPORT REACTDOM
const saudacao = document.getElementById('root')
reactDOM.render('Hello, World!',saudacao)

// Outro modo de renderizar. Esse está renderizando atualmente
reactDOM.render(
    'Or hellooo, World!!!',
    document.getElementById('root')
)
// COM O USO DO IMPORT REACTDOM
 
// COM O USO DO IMPORT REACT PURO
reactDOM.render(
    <div>
        <strong>
            Hello, Real World!!
        </strong>
    </div>,
    document.getElementById('root')
)
// Também pode ser armazenado em constante
const novaSaudacao = <strong>The new real world!!!</strong>;
reactDOM.render(
    <div>
        {novaSaudacao} {/* chama JS */}
    </div>,
    document.getElementById('root')
)
// Também pode ser armazenado em constante
// COM O USO DO IMPORT REACT PURO

// PRIMEIRO COMPONENTE
reactDOM.render(
    <div>
        <Primeiro></Primeiro>
    </div>,
    document.getElementById('root')
)
// PRIMEIRO COMPONENTE