provider "aws" {
  region = var.regiao

}

//pt5aluno55
//terraform init
//terraform plan
//terraform apply
//terraform fmt
//ubuntu@ip-.......
//ssh -i pasta/nome-da-chave usuario@IP-ou-DNS
//ssh -i .ssh/terraform-aws ubuntu@3.141.85.40

# terraform init - baixar os modulos do terraform baseado nos seus arquivos
# terraform plan - mostrar o plano a ser feito
# terraform apply - vai aplicar o plano ou seja vai contruir tudo se não tiver erro
# terraform destroy - acabou, já era boa sorte
# terraform output - mostra as saidas do output
# terraform show - mostra como está a sua infra

# ssh -i pasta/nome-da-chave usuario@IP-ou-DNS
# ssh -i .ssh/terraform-aws ubuntu@3.144.175.156
