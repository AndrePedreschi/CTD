import axios from 'axios'

const api = axios.create({

  baseURL: 'http://ctdsummerweek.nerdasaservice.com.br'

})

export default api