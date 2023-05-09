import React from 'react'
import ReactDOM from 'react-dom/client'
import {
  createBrowserRouter,
  RouterProvider,
  redirect,
} from "react-router-dom"
import './global.scss'

import App from './App'
import { Home } from './pages/Home'
import { Product } from "./pages/Product"



const root = ReactDOM.createRoot(document.getElementById('root'))

const appRouter = createBrowserRouter([
  {
    path: "",
    element: <App />,

    children: [
      {
        path: '',
        loader: () => redirect('/home'),

      },
      {
        path: '/',
        loader: () => redirect('/home'),


      },
      {
        path: '*',
        loader: () => redirect('https://http.cat/404'),

      },
      {
        path: "home",
        element: <Home />,

      },
      {
        path: "product/:id",
        element: <Product />,
      },

    ],
  }
]
)

root.render(
  <RouterProvider router={appRouter} />
)
