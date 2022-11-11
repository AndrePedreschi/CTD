import { useState, useEffect } from "react";
import './style.scss'

export function DecimaTerceiraAula() {

    const [contador, setContador] = useState(0)
    const [userName, setUserName] = useState('')
    const [userNameError, setUserNameError] = useState(false)

    function adicionar(){
        setContador(contador +1)
    }


    useEffect(() => {
          
      if(userName.length > 10){
        setUserNameError(true)
      }else{
        setUserNameError(false)
      }

      
      /* return () => {
        second
      } */
    }, [userName])
    
    

    return (
        <>
        <h1></h1>
        <input type="text" value={userName} onChange={event => setUserName(event.target.value) }/>
        {userNameError ? (<small>O campo nome contém mais do que 10 caracteres</small>):null}
        <p>O valor do contador é {contador}</p>
        <button onClick={()=>adicionar()}>Atualizar contador</button>
        </>
    )
}