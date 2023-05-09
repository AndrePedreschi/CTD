import { useState, useEffect } from "react";


export function App() {
  const [contador, setContador] = useState(0);

  useEffect(() => {
    
  
    return () => {
      
    }

  }, [])
  
  const aumentarContador = () => {
    //setContador(contador + 1);
    setContador((previous)=> previous+1)
    setContador((previous)=> previous+1)
    setContador((previous)=> previous+1)
  };

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={aumentarContador}>Aumentar +1</button>
    </div>
  );


}