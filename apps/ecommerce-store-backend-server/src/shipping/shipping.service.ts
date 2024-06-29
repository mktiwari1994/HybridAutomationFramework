import { Injectable } from "@nestjs/common";
import { PrismaService } from "../prisma/prisma.service";
import { ShippingServiceBase } from "./base/shipping.service.base";

@Injectable()
export class ShippingService extends ShippingServiceBase {
  constructor(protected readonly prisma: PrismaService) {
    super(prisma);
  }
}
