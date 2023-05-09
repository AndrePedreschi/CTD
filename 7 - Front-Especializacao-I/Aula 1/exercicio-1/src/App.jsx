//import './App.css'
import { Outlet } from "react-router-dom";
import { Header } from './Components/Header';

function App() {

  return (
    <>
      <Header />
      <main className='main'>
        <Outlet />
      </main>
    </>
  )
}

export default App
