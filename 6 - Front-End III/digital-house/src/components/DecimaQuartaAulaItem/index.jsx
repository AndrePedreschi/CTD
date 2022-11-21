import { useEffect } from "react"
import { useState } from "react"

export function DecimaQuartaAulaItem(props){
// const [registerDeleted, setRegisterDeleted] = useState(false)
const [formInvalid, setFormInvalid] = useState(false)

/* function validarFormulario() {

    // {...}

    setFormInvalid(!formInvalid)

} */



function deletarRegistro() {

    // Utilizando a Função para comunicar o Componente Pai
    props.deleteRegister(props.registerData)

}



useEffect(() => {

    console.log('O componente foi Construído')

    return () => console.log('O componente foi Destruído')

}, [])



// useEffect que será acionado quando a variavel formValid for alterada
/* useEffect(() => {

    if(formInvalid) {

        // console.log('O formulario está invalido')

    } else {

        // console.log('O formulário está valido')

    }

}, [formInvalid]) */

return(

    <li>
        <h1>{props.registerData.title}</h1>
        <button onClick={() => deletarRegistro()}>Deletar</button>
    </li>

)

}