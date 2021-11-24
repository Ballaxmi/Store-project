package com.user.service;

import java.util.List;

import com.user.model.Address;

public interface AddressService {
public List<Address> getAddressData();

public String deleteAddress(String addressId);

public String addAddress(String addressId, String permanentAddress, String temporaryAddress, String officeAddress);

}