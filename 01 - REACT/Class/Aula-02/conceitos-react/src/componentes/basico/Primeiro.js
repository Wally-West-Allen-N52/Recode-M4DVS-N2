//  Importar componente para index
import React from "react"
// Criação de ´rimeiro componente
export default function Primeiro() {
    const msg = 'Caola na minha!'
    return (
        <div>
            <h2>Primeiro Componente</h2>
            <p>{msg}</p>
        </div>
    )
}