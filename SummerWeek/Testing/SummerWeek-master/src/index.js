import React from 'react'
import ReactDOM from 'react-dom'

import Home from './pages/home'
import { FavoritesProvider } from './providers/favorites'

import 'bootstrap/dist/css/bootstrap.min.css'
import './index.css'

ReactDOM.render(
  <React.StrictMode>
    <FavoritesProvider>
      <Home />
    </FavoritesProvider>
  </React.StrictMode>,
  document.getElementById('root')
)
