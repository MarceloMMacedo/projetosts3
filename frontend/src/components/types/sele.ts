export type SaleSum = {
    sellerName: string;
    sum: number;
};
export type SaleSuccess = {
    sellerName: string;
    visited: number;
    deals: number;
}
export type Seller = {
    name: string;
    id: number;
}
export type SalePage = {
    content?: Sale[],   
    last: boolean,
    totalPages: number,
    totalElements: number,   
    first: boolean,
    number: number,
    numberOfElements?: number,
    size?: number,
    empty?: boolean
}
export type Sale = {
    id: number,
    visited: number,
    deals: number,
    amount: number,
    date: string,
    seller: Seller
}