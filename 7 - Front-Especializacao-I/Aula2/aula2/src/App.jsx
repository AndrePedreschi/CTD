import { useState, useRef } from 'react'

import './App.css'

function App() {

  const inputRef = useRef(null)
  const divRef = useRef(null)


  function handleCheck() {
    const inputValue = inputRef.current.value

    if (inputValue < 10) {
      divRef.current.style.backgroundColor = "red";
    } else {
      divRef.current.style.backgroundColor = "blue";
    }
  }


  return (
    <>
      <div ref={divRef}>

        <input
          ref={inputRef} />

        <button onClick={handleCheck}>Adicionar</button>
      </div>

    </>
  )
}

export default App
