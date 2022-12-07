//import { useState } from 'react'

import { createBrowserRouter, RouterProvider } from "react-router-dom";

import { Login } from './pages/Login'
import { SegundaAula } from './lessons/SegundaAula'
import { TerceiraAula } from './lessons/TerceiraAula'
import { QuartaAula } from './lessons/QuartaAula'
import { QuintaAula } from './lessons/QuintaAula'
import { CapivaraGames } from './pages/CapivaraGames'
import { SetimaAula } from './lessons/SetimaAula'
import { OitavaAula } from './lessons/OitavaAula'
import { DecimaTerceiraAula } from './lessons/DecimaTerceiraAula'
import { IntegradoraAula13 } from './pages/IntegradoraAula13'
import { DecimaQuartaAula } from './lessons/DecimaQuartaAula'
import { DecimaQuintaAula } from './lessons/DecimaQuintaAula'
import { MainLayout } from "./components/MainLayout"
import { JsonPlaceholder } from "./pages/JsonPlaceholder";
import { JsonPlaceholderPostItem } from "./components/RedeSocial/JsonPlaceholderPostItem";
import { ToDo } from "./pages/ToDo"

import { ThemeProvider } from "./hooks/useTheme"
import { Configurations } from "./pages/Configurations"
import { LanguageProvider } from "./hooks/useLanguage"
import { ConfigProvider } from "./hooks/useConfigurations";

function App() {

  const router = createBrowserRouter([
    {
      path: "",
      element: <MainLayout />,
      children: [
        {
          path: "/Login",
          element: <Login />,
        },
        {
          path: "/SegundaAula",
          element: <SegundaAula />,
        },
        {
          path: "/TerceiraAula",
          element: <TerceiraAula />,
        },
        {
          path: "/QuartaAula",
          element: <QuartaAula />,
        },
        {
          path: "/QuintaAula",
          element: <QuintaAula />,
        },
        {
          path: "/CapivaraGames",
          element: <CapivaraGames />,
        },
        {
          path: "/SetimaAula",
          element: <SetimaAula />,
        },
        {
          path: "/OitavaAula",
          element: <OitavaAula />,
        },
        {
          path: "/DecimaTerceiraAula",
          element: <DecimaTerceiraAula />,
        },
        {
          path: "/IntegradoraAula13",
          element: <IntegradoraAula13 />,
        },
        {
          path: "/DecimaQuartaAula",
          element: <DecimaQuartaAula />,
        },
        {
          path: "/DecimaQuintaAula",
          element: <DecimaQuintaAula />,
        },
        {
          //teste de paramentros
          path: "/DecimaQuintaAula/:id",
          element: <DecimaQuintaAula />,
        },
        {
          path: "/RedeSocial",
          element: <JsonPlaceholder />,
          children: [
            {
              path: "/RedeSocial/Post/:id",
              element: <JsonPlaceholderPostItem />,
            },
          ]
        },
        {
          path: '/Configurations',
          element: <Configurations />
        },
        {
          path: '/to-do',
          element: <ToDo />
        }
      ]
    },
  ]);


  return (
    <ConfigProvider>
      <RouterProvider router={router} />
    </ConfigProvider>

  )
}

export default App
