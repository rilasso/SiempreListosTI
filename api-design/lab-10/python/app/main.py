from fastapi import FastAPI, Header, Query
from fastapi.responses import JSONResponse
from pydantic import BaseModel

app = FastAPI()

# Definición de modelos
class Token(BaseModel):
    token: str

class Product(BaseModel):
    id: str
    alias: str
    name: str
    description: str
    currency: str
    status: str
    balance: float
    
class Products(BaseModel):
    products: list[Product]

class Cuentas(BaseModel):
    id: str
    username: str
    password: str
    
    

# Endpoints
@app.get("/user/login", response_model=Token)
async def login_user(x_request_id: str = Header(...), x_channel: str = Header(...),
                      username: str = Query(...), password: str = Query(...)):
    # Validación de usuario y contraseña, generación de token y retorno
    token = generate_token()
    return {"token": token}


@app.get("/product", response_model=Products)
async def get_products(  authorization: str = Header(...),x_request_id: str = Header(...),
                        x_channel: str = Header(...)):
    # Validación de token y retorno de lista de productos
    products = get_products_list()
    return {"products": products}

@app.get("/product/{Id}", response_model=Product)
async def get_product_details(Id: str, authorization: str = Header(...),
                               x_request_id: str = Header(...), x_channel: str = Header(...)):
    # Validación de token y retorno de detalles del producto
    product = get_product_details(Id)
    return product

@app.get("/cuentas/{Id}", response_model=Cuentas)
async def get_product_details(Id: str, authorization: str = Header(...),
                               x_request_id: str = Header(...), x_channel: str = Header(...)):
    # Validación de token y retorno de detalles del producto
    cuentas = get_cuentas_details(Id)
    return cuentas

import random
def generate_token():
    """
    Generates a random token string of length 10.
    """
    chars = 'abcdefghijklmnopqrstuvwxyz0123456789'
    return ''.join(random.choice(chars) for i in range(10))

def get_products_list():
    products = [
        Product(
            id="1",
            alias="product-1",
            name="Product 1",
            description="This is the first product",
            currency="USD",
            status="available",
            balance=100.0
        ),
        Product(
            id="2",
            alias="product-2",
            name="Product 2",
            description="This is the second product",
            currency="EUR",
            status="sold out",
            balance=0.0
        ),
        # Add more products here
    ]
    return products


def get_product_details(Id: str):
    product = {
        "id": "1",
        "alias": "product-1",
        "name": "Product 1",
        "description": "This is the first product",
        "currency": "USD",
        "status": "available",
        "balance": 100.0,
    }
    return product

def get_cuentas_details(Id: str):
    cuentas = {
        "id": "1",
        "username": "Usuario",
        "password": "Contraseña",
    }
    return cuentas